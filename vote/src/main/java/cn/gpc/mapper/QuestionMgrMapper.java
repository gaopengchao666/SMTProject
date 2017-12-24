package cn.gpc.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.gpc.model.QuestionModel;

/**
 * 题目管理Mapper接口
 * @author xzz
 *
 */
@Repository
public interface QuestionMgrMapper
{
	/**
	 * 根据题目ID生成题目
	 * @return 题目
	 */
	List<QuestionModel> createQuestionById();
	
	/**
	 * 根据题目ID生成答案选项
	 * @param questionIdList
	 * @return
	 */
	List<String> creatAnswerById(int questionId);
}
