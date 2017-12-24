package cn.gpc.model;

import java.util.List;

import lombok.Data;

/**
 * 题目模型
 * @author Administrator
 *
 */
public class QuestionModel 
{
	//题目ID
	private int questionId;
	
	//题目描述
	private String questionDesc;
	
	//题目答案
	private List<String> answerList;
	
	//题目分数
	private int questionScore;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionDesc() {
		return questionDesc;
	}

	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}

	public List<String> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<String> answerList) {
		this.answerList = answerList;
	}

	public int getQuestionScore() {
		return questionScore;
	}

	public void setQuestionScore(int questionScore) {
		this.questionScore = questionScore;
	}

	@Override
	public String toString() {
		return "QuestionModel [questionId=" + questionId + ", questionDesc=" + questionDesc + ", answerList="
				+ answerList + ", questionScore=" + questionScore + "]";
	}
	
	
}
