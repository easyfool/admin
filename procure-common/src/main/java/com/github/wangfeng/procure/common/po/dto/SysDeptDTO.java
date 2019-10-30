package com.github.wangfeng.procure.common.po.dto;

import com.github.wangfeng.procure.common.po.entity.primary.SysDeptDO;
import lombok.Data;

/**
 * @Auther: wangfeng
 * @Date: 2019/10/28 14:08
 * @Description:
 */
@Data
public class SysDeptDTO extends SysDeptDO {

    /** 父部门名称 */
    private String parentName;

}
