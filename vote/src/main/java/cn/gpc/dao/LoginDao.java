package cn.gpc.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.gpc.mapper.LoginMapper;

@Component
public class LoginDao {

    @Resource
    private LoginMapper loginMapper;
    
    /**
     * 查询账号信息
     * @param type
     * @return
     */
    public List<Map<String,Object>> queryUserInfo(String type)
    {
        return loginMapper.queryUserInfo(type);
    }
    /**
     * 添加账号信息
     * @param paramMap
     * @return
     */
    public boolean addAccount(Map<String, String> paramMap) 
    {
        return loginMapper.addAccount(paramMap);
    }
}
