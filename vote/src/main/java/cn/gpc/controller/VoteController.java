package cn.gpc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gpc.model.VoteTheme;
import cn.gpc.service.VoteThemeService;

/**
 * 投票主题管理
 * @version 1.0
 */
@Controller
@RequestMapping("/theme")
public class VoteController
{
    @Resource
    private VoteThemeService voteThemeService;
    
    @RequestMapping(value = "/queryVotes", method = RequestMethod.GET)
    public String queryVotes(Model model)
    {
        Map<String,Object> params = new HashMap<String,Object>();
        List<VoteTheme> votes = voteThemeService.selectVotesByPage(params);
        model.addAttribute("votes", votes);
        return "voteManage";
    }
    
    /**
     * 登录认证
     * @version 1.0
     */
    @RequestMapping("/loginSystem")
    @ResponseBody
    public String loginSystem(String params)
    {
        return params;
    }
}
