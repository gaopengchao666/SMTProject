package cn.gpc.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * 投票主題mapper
 * @author Administrator
 *
 */
@Repository
public interface LoginMapper
{

     /**
     * 获取用户账号信息
     * @return
     */
    List<Map<String,Object>> queryUserInfo(@Param("type")String type);

    /**
     * 添加账号信息
     * @param paramMap
     * @return
     */
    boolean addAccount(Map<String, String> paramMap);
}