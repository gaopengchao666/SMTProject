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
	public QuestionModel creatQuestion(int questionId)
	{
		QuestionModel questionModel = new QuestionModel();
		List<String> answerList = new ArrayList<String>();
		try{
			 questionModel = questionMgrMapper.createQuestionById(questionId);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		answerList = questionMgrMapper.creatAnswerById(questionId);
		questionModel.setAnswerList(answerList);
		return questionModel;
	}
	
}
