package cn.gpc.service;

import java.util.List;

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
	 * @return 对应题目内容
	 */
	List<QuestionModel> creatQuestion();
}
