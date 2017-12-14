package cn.gpc.model;

import lombok.Data;

/**
 * 投票主题模型
 * @author Administrator
 *
 */
@Data
public class VoteTheme
{
    //主键
    private Integer id;

    //投票主题
    private String themeName;

    //投票描述
    private String describe;
}