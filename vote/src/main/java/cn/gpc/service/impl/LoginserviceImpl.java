package cn.gpc.service.impl;

import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.gpc.dao.LoginDao;
import cn.gpc.service.LoginService;

import com.google.gson.Gson;

@Component
@SuppressWarnings("all")
public class LoginserviceImpl implements LoginService {
   
    @Resource
    private LoginDao loginDao;
    public List<Map<String,Object>> loginSystem(String params)
   {
       Map<String,String> paramMap = new Gson().fromJson(params, Map.class);
       return loginDao.queryUserInfo(paramMap.get("type"));
   }
    
    /**
     * 添加账号成功或失败
     * @param params
     * @return
     */
    public boolean addAccount(String params)
    {
        Map<String,String> paramMap = new Gson().fromJson(params, Map.class);
        return loginDao.addAccount(paramMap);
    }

}
