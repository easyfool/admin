package com.github.wangfeng.procure.common.po.entity.primary;

import com.github.wangfeng.procure.common.po.entity.BaseEntity;
import java.util.Date;
import lombok.Data;

@Data
public class SysUserOnlineDO extends BaseEntity {

    /** 在线状态 */
    private String status;
    /** 用户会话id */
    private String sessionId;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.sessionId
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private String sessionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.login_name
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.dept_name
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private String deptName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.ipaddr
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private String ipaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.login_location
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private String loginLocation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.browser
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private String browser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.os
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private String os;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.start_timestamp
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private Date startTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.last_access_time
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private Date lastAccessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online.expire_time
     *
     * @mbg.generated Mon Oct 28 17:13:36 CST 2019
     */
    private Long expireTime;

}