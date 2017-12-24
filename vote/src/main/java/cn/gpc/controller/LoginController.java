package cn.gpc.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gpc.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
    
    @Resource
    private LoginService loginService;
    
    /**
     * 查询账号数据
     * @version 1.0
     */
    @RequestMapping("/queryAccountInfo")
    @ResponseBody
    public List<Map<String,Object>> queryAccountInfo(String params)
    {
        return loginService.loginSystem(params);
    }
    
    /**
     * 增加用户或团队账号信息
     */
    @RequestMapping("/addAccount")
    @ResponseBody
    public boolean addAccount(String params)
    {
        return loginService.addAccount(params);
    }

}
