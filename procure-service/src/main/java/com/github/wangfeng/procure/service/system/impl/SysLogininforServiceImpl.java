package com.github.wangfeng.procure.service.system.impl;

import com.github.wangfeng.procure.common.po.entity.primary.SysLogininforDO;
import com.github.wangfeng.procure.common.utils.text.Convert;
import com.github.wangfeng.procure.dao.primary.system.SysLogininforMapper;
import com.github.wangfeng.procure.service.system.SysLogininforService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 系统访问日志情况信息 服务层处理
 * 
 * @author wangfeng
 */
@Service
public class SysLogininforServiceImpl implements SysLogininforService
{

    @Autowired
    private SysLogininforMapper logininforMapper;

    /**
     * 新增系统登录日志
     * 
     * @param logininfor 访问日志对象
     */
    @Override
    public void insertLogininfor(SysLogininforDO logininfor)
    {
        logininforMapper.insertLogininfor(logininfor);
    }

    /**
     * 查询系统登录日志集合
     * 
     * @param logininfor 访问日志对象
     * @return 登录记录集合
     */
    @Override
    public List<SysLogininforDO> selectLogininforList(SysLogininforDO logininfor)
    {
        return logininforMapper.selectLogininforList(logininfor);
    }

    /**
     * 批量删除系统登录日志
     * 
     * @param ids 需要删除的数据
     * @return
     */
    @Override
    public int deleteLogininforByIds(String ids)
    {
        return logininforMapper.deleteLogininforByIds(Convert.toStrArray(ids));
    }

    /**
     * 清空系统登录日志
     */
    @Override
    public void cleanLogininfor()
    {
        logininforMapper.cleanLogininfor();
    }
}
