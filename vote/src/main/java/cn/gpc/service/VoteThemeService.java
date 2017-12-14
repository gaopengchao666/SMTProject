package cn.gpc.service;

import java.util.List;
import java.util.Map;

import cn.gpc.model.VoteTheme;

/**
 * 投票主題 接口
 * @author Administrator
 *
 */
public interface VoteThemeService
{
    /**
     * 刪除主題
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 增加主題
     * @param record
     * @return
     */
    int insert(VoteTheme record);


    /**
     * 增加主題
     * @param record
     * @return
     */
    int insertSelective(VoteTheme record);

    /**
     * 查詢主題
     * @param id
     * @return
     */
    VoteTheme selectByPrimaryKey(Integer id);
    
    /**
     * 分頁查詢主題
     * @param id
     * @return
     */
    List<VoteTheme> selectVotesByPage(Map<String,Object> params);

    /**
     * 更新主題
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(VoteTheme record);

    /**
     * 更新主題
     * @param record
     * @return
     */
    int updateByPrimaryKey(VoteTheme record);

}
