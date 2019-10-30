package com.github.wangfeng.procure.dao.primary.system;

import com.github.wangfeng.procure.common.po.entity.primary.SysDeptDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysDeptMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated Mon Oct 28 13:27:19 CST 2019
     */
    int deleteByPrimaryKey(Long deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated Mon Oct 28 13:27:19 CST 2019
     */
    int insert(SysDeptDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated Mon Oct 28 13:27:19 CST 2019
     */
    int insertSelective(SysDeptDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated Mon Oct 28 13:27:19 CST 2019
     */
    SysDeptDO selectByPrimaryKey(Long deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated Mon Oct 28 13:27:19 CST 2019
     */
    int updateByPrimaryKeySelective(SysDeptDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated Mon Oct 28 13:27:19 CST 2019
     */
    int updateByPrimaryKey(SysDeptDO record);

    /**
     * 查询部门人数
     *
     * @param dept 部门信息
     * @return 结果
     */
    public int selectDeptCount(SysDeptDO dept);

    /**
     * 查询部门是否存在用户
     *
     * @param deptId 部门ID
     * @return 结果
     */
    public int checkDeptExistUser(Long deptId);

    /**
     * 查询部门管理数据
     *
     * @param dept 部门信息
     * @return 部门信息集合
     */
    public List<SysDeptDO> selectDeptList(SysDeptDO dept);

    /**
     * 删除部门管理信息
     *
     * @param deptId 部门ID
     * @return 结果
     */
    public int deleteDeptById(Long deptId);

    ///**
    // * 新增部门信息
    // *
    // * @param dept 部门信息
    // * @return 结果
    // */
    //public int insertDept(SysDeptDO dept);

    /**
     * 修改部门信息
     *
     * @param dept 部门信息
     * @return 结果
     */
    public int updateDept(SysDeptDO dept);

    /**
     * 修改子元素关系
     *
     * @param depts 子元素
     * @return 结果
     */
    public int updateDeptChildren(@Param("depts") List<SysDeptDO> depts);

    /**
     * 根据部门ID查询信息
     *
     * @param deptId 部门ID
     * @return 部门信息
     */
    public SysDeptDO selectDeptById(Long deptId);

    /**
     * 校验部门名称是否唯一
     *
     * @param deptName 部门名称
     * @param parentId 父部门ID
     * @return 结果
     */
    public SysDeptDO checkDeptNameUnique(@Param("deptName") String deptName, @Param("parentId") Long parentId);

    /**
     * 根据角色ID查询部门
     *
     * @param roleId 角色ID
     * @return 部门列表
     */
    public List<String> selectRoleDeptTree(Long roleId);

    /**
     * 修改所在部门的父级部门状态
     *
     * @param dept 部门
     */
    public void updateDeptStatus(SysDeptDO dept);

    /**
     * 根据ID查询所有子部门
     * @param deptId 部门ID
     * @return 部门列表
     */
    public List<SysDeptDO> selectChildrenDeptById(Long deptId);
}