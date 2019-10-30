package com.github.wangfeng.procure.dao.primary.system;


import com.github.wangfeng.procure.common.po.entity.primary.SysPostDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysPostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_post
     *
     * @mbg.generated Mon Oct 28 16:38:04 CST 2019
     */
    int deleteByPrimaryKey(Long postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_post
     *
     * @mbg.generated Mon Oct 28 16:38:04 CST 2019
     */
    int insert(SysPostDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_post
     *
     * @mbg.generated Mon Oct 28 16:38:04 CST 2019
     */
    int insertSelective(SysPostDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_post
     *
     * @mbg.generated Mon Oct 28 16:38:04 CST 2019
     */
    SysPostDO selectByPrimaryKey(Long postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_post
     *
     * @mbg.generated Mon Oct 28 16:38:04 CST 2019
     */
    int updateByPrimaryKeySelective(SysPostDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_post
     *
     * @mbg.generated Mon Oct 28 16:38:04 CST 2019
     */
    int updateByPrimaryKey(SysPostDO record);

    /**
     * 查询岗位数据集合
     *
     * @param post 岗位信息
     * @return 岗位数据集合
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
     */
    public int deletePostByIds(Long[] ids);

    /**
     * 修改岗位信息
     *
     * @param post 岗位信息
     * @return 结果
     */
    public int updatePost(SysPostDO post);

    /**
     * 新增岗位信息
     *
     * @param post 岗位信息
     * @return 结果
     */
    public int insertPost(SysPostDO post);

    /**
     * 校验岗位名称
     *
     * @param postName 岗位名称
     * @return 结果
     */
    public SysPostDO checkPostNameUnique(String postName);

    /**
     * 校验岗位编码
     *
     * @param postCode 岗位编码
     * @return 结果
     */
    public SysPostDO checkPostCodeUnique(String postCode);
}