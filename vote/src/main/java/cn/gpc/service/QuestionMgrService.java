package cn.gpc.service;

import cn.gpc.model.QuestionModel;

/**
 * 题目管理接口
 * @author Administrator
 *
 */
public interface QuestionMgrService 
{
	/**
	 * 页面创建题目
	 * @param questionId 题目ID
	 * @return 对应题目内容
	 */
	QuestionModel creatQuestion(int questionId);
}
