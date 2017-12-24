package cn.gpc.service;

import java.util.List;
import java.util.Map;

public interface LoginService {

    /**
     * 登陆系统成功与否
     * @param params
     * @return
     */
    List<Map<String,Object>> loginSystem(String params);

    /**
     * 添加账号成功或失败
     * @param params
     * @return
     */
    boolean addAccount(String params);
}
