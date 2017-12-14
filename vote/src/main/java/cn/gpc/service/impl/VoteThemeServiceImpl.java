package cn.gpc.service.impl;

import java.util.List;
import java.util.Map;



import javax.annotation.Resource;

import lombok.Data;

import org.springframework.stereotype.Service;

import cn.gpc.dao.VoteThemeMapper;
import cn.gpc.model.VoteTheme;
import cn.gpc.service.VoteThemeService;

/**
 * 投票主题服务类
 * @author Administrator
 *
 */
@Service
@Data
public class VoteThemeServiceImpl implements VoteThemeService
{
    @Resource
    private VoteThemeMapper voteThemeMapper;

    /**
     * 删除主题
     */
    @Override
    public int deleteByPrimaryKey(Integer id)
    {
        return voteThemeMapper.deleteByPrimaryKey(id);
    }

    /**
     * 增加主题
     */
    @Override
    public int insert(VoteTheme record)
    {
        return voteThemeMapper.insert(record);
    }

   /**
    * 增加主题
    */
    @Override
    public int insertSelective(VoteTheme record)
    {
        return voteThemeMapper.insertSelective(record);
    }

    /**
     * 查询主题
     */
    @Override
    public VoteTheme selectByPrimaryKey(Integer id)
    {
        return voteThemeMapper.selectByPrimaryKey(id);
    }

    /**
     * 分页查询主题
     */
    @Override
    public List<VoteTheme> selectVotesByPage(Map<String, Object> params)
    {
        return voteThemeMapper.selectVotesByPage(params);
    }

    /**
     * 更新主题
     */
    @Override
    public int updateByPrimaryKeySelective(VoteTheme record)
    {
        return voteThemeMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 更新主题
     */
    @Override
    public int updateByPrimaryKey(VoteTheme record)
    {
        return voteThemeMapper.updateByPrimaryKey(record);
    }

}
