package com.github.wangfeng.procure.common.po.entity.primary;

import com.github.wangfeng.procure.common.po.entity.BaseEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleDO extends BaseEntity {

    public SysRoleDO(Long roleId) {
        this.roleId = roleId;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_id
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_name
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_key
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private String roleKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_sort
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private Integer roleSort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.data_scope
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private String dataScope;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.remark
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.status
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_date
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_by
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.update_date
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.update_by
     *
     * @mbg.generated Mon Oct 28 13:38:48 CST 2019
     */
    private String updateBy;

    /** 用户是否存在此角色标识 默认不存在 */
    private boolean flag = false;

    /** 菜单组 */
    private Long[] menuIds;

    /** 部门组（数据权限） */
    private Long[] deptIds;

    public boolean isAdmin()
    {
        return isAdmin(this.roleId);
    }

    //TODO 应该根据role来判断，不能写死
    public static boolean isAdmin(Long roleId)
    {
        return roleId != null && 1L == roleId;
    }

}