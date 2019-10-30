package com.github.wangfeng.procure.service.system;

import com.github.wangfeng.procure.common.po.entity.primary.SysOperLogDO;
import java.util.List;

/**
 * 操作日志 服务层
 * 
 * @author wangfeng
 */
public interface SysOperLogService
{
    /**
     * 新增操作日志
     * 
     * @param operLog 操作日志对象
     */
    public void insertOperlog(SysOperLogDO operLog);

    /**
     * 查询系统操作日志集合
     * 
     * @param operLog 操作日志对象
     * @return 操作日志集合
     */
    public List<SysOperLogDO> selectOperLogList(SysOperLogDO operLog);

    /**
     * 批量删除系统操作日志
     * 
     * @param ids 需要删除的数据
     * @return 结果
     */
    public int deleteOperLogByIds(String ids);

    /**
     * 查询操作日志详细
     * 
     * @param operId 操作ID
     * @return 操作日志对象
     */
    public SysOperLogDO selectOperLogById(Long operId);

    /**
     * 清空操作日志
     */
    public void cleanOperLog();
}
