package cn.gpc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import cn.gpc.service.QuestionMgrService;

/**
 * 题目获取controller
 * @version 1.0
 */
@Controller
@RequestMapping("/question")
public class QuestionController 
{
	@Resource
    private QuestionMgrService questionMgrService;
	
	@RequestMapping(value = "/createQuestion", method = RequestMethod.GET)
	@ResponseBody
    public String createQuestionById()
    {
		Gson json = new Gson();
        return json.toJson(questionMgrService.creatQuestion());
    }
}
