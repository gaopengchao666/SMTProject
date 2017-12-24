package cn.gpc.mapper;

import java.util.List;

import cn.gpc.model.QuestionModel;

/**
 * 题目管理Mapper接口
 * @author xzz
 *
 */
public interface QuestionMgrMapper
{
	/**
	 * 根据题目ID生成题目
	 * @param questionId 题目ID
	 * @return 题目
	 */
	QuestionModel createQuestionById(int questionId);
	
	/**
	 * 根据题目ID生成答案选项
	 * @param questionId
	 * @return
	 */
	List<String> creatAnswerById(int questionId);
}
