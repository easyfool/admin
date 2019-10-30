package com.github.wangfeng.procure.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Auther: wangfeng
 * @Date: 2019/9/23 13:33
 * @Description: 数据状态枚举类
 */
@AllArgsConstructor
@Getter
public enum DataEntityStatusEnum {
    STATUS_NORMAL(0, "正常"),
    STATUS_DELETED(1, "删除"),
    STATUS_DISABLE(2, "不可用"),
    STATUS_FREEZE(3, "冻结"),
    STATUS_AUDIT(4, "授权"),
    STATUS_AUDIT_BACK(5, ""),
    STATUS_BANNED(6, "禁用"),
    STATUS_LOCKED(7, "锁定"),
    STATUS_EXCEPTION(8, "异常"),
    STATUS_DRAFT(9, "草稿")
    ;
    private int statusCode;
    private String descrition;
}
