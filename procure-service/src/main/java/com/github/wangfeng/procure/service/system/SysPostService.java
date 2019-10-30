package com.github.wangfeng.procure.service.system;

import com.github.wangfeng.procure.common.po.entity.primary.SysPostDO;
import java.util.List;

/**
 * 岗位信息 服务层
 * 
 * @author wangfeng
 */
public interface SysPostService
{
    /**
     * 查询岗位信息集合
     * 
     * @param post 岗位信息
     * @return 岗位信息集合
     */
    public List<SysPostDO> selectPostList(SysPostDO post);

    /**
     * 查询所有岗位
     * 
     * @return 岗位列表
     */
    public List<SysPostDO> selectPostAll();

    /**
     * 根据用户ID查询岗位
     * 
     * @param userId 用户ID
     * @return 岗位列表
     */
    public List<SysPostDO> selectPostsByUserId(Long userId);

    /**
     * 通过岗位ID查询岗位信息
     * 
     * @param postId 岗位ID
     * @return 角色对象信息
     */
    public SysPostDO selectPostById(Long postId);

    /**
     * 批量删除岗位信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     * @throws Exception 异常
     */
    public int deletePostByIds(String ids) throws Exception;

    /**
     * 新增保存岗位信息
     * 
     * @param post 岗位信息
     * @return 结果
     */
    public int insertPost(SysPostDO post);

    /**
     * 修改保存岗位信息
     * 
     * @param post 岗位信息
     * @return 结果
     */
    public int updatePost(SysPostDO post);

    /**
     * 通过岗位ID查询岗位使用数量
     * 
     * @param postId 岗位ID
     * @return 结果
     */
    public int countUserPostById(Long postId);

    /**
     * 校验岗位名称
     * 
     * @param post 岗位信息
     * @return 结果
     */
    public String checkPostNameUnique(SysPostDO post);

    /**
     * 校验岗位编码
     * 
     * @param post 岗位信息
     * @return 结果
     */
    public String checkPostCodeUnique(SysPostDO post);
}
