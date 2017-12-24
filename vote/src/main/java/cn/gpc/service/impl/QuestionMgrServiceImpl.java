package cn.gpc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gpc.mapper.QuestionMgrMapper;
import cn.gpc.model.QuestionModel;
import cn.gpc.service.QuestionMgrService;
import lombok.Data;

/**
 * 投票主题服务类
 * @author Administrator
 *
 */
@Service
@Data
public class QuestionMgrServiceImpl implements QuestionMgrService
{
	@Resource
    private QuestionMgrMapper questionMgrMapper;

	/**
	 * 生成题目
	 */
	@Override
	public List<QuestionModel> creatQuestion()
	{
		int questionId;
		List<QuestionModel> questionModel = new ArrayList<QuestionModel>();
		List<List<String>> answerListAll = new ArrayList<List<String>>();
		List<String> answerList = new ArrayList<String>();
		try{
			 questionModel = questionMgrMapper.createQuestionById();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		for(QuestionModel qm : questionModel)
		{
			questionId = qm.getQuestionId();
			answerList = questionMgrMapper.creatAnswerById(questionId);
			answerListAll.add(answerList);
		}
		for(int i = 0; i < questionModel.size(); i++)
		{
			questionModel.get(i).setAnswerList(answerListAll.get(i));
		}
		return questionModel;
	}
	
}
