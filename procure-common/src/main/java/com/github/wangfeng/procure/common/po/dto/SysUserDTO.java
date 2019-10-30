package com.github.wangfeng.procure.common.po.dto;

import com.github.wangfeng.procure.common.po.entity.primary.SysUserDO;

/**
 * @Auther: wangfeng
 * @Date: 2019/10/28 15:40
 * @Description:
 */
public class SysUserDTO extends SysUserDO {

    @Override
    public boolean isAdmin() {
        return isAdmin(getUserId());
    }


    public static boolean isAdmin(Long userId) {
        //TODO 判断是否是admin应该根据role来判断
        return userId != null && 1L == userId;
    }
}
