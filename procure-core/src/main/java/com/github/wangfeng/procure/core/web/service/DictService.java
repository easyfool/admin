package com.github.wangfeng.procure.core.web.service;

import com.github.wangfeng.procure.common.po.entity.primary.SysDictDataDO;
import com.github.wangfeng.procure.service.system.SysDictDataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RuoYi首创 html调用 thymeleaf 实现字典读取
 * 
 * @author wangfeng
 */
@Service("dict")
public class DictService
{
    @Autowired
    private SysDictDataService dictDataService;

    /**
     * 根据字典类型查询字典数据信息
     * 
     * @param dictType 字典类型
     * @return 参数键值
     */
    public List<SysDictDataDO> getType(String dictType)
    {
        return dictDataService.selectDictDataByType(dictType);
    }

    /**
     * 根据字典类型和字典键值查询字典数据信息
     * 
     * @param dictType 字典类型
     * @param dictValue 字典键值
     * @return 字典标签
     */
    public String getLabel(String dictType, String dictValue)
    {
        return dictDataService.selectDictLabel(dictType, dictValue);
    }
}
