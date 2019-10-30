package com.github.wangfeng.procure.admin.web.system;

import com.github.wangfeng.procure.common.annotation.Log;
import com.github.wangfeng.procure.common.controller.BaseController;

import com.github.wangfeng.procure.common.enums.BusinessType;
import com.github.wangfeng.procure.common.po.dto.AjaxResult;
import com.github.wangfeng.procure.common.po.dto.page.TableDataInfo;
import com.github.wangfeng.procure.common.po.entity.primary.SysDictDataDO;
import com.github.wangfeng.procure.common.utils.poi.ExcelUtil;
import com.github.wangfeng.procure.core.utils.ShiroUtils;
import com.github.wangfeng.procure.service.system.SysDictDataService;
import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 数据字典信息
 *
 * @author wangfeng
 */
@Controller
@RequestMapping("/system/dict/data")
public class SysDictDataController extends BaseController {

    private String prefix = "system/dict/data";

    @Autowired
    private SysDictDataService dictDataService;

    @RequiresPermissions("system:dict:view")
    @GetMapping()
    public String dictData() {
        return prefix + "/data";
    }

    //@PostMapping("/list")
    //@RequiresPermissions("system:dict:list")
    //@ResponseBody
    //public TableDataInfo list(SysDictDataDO dictData)
    //{
    //    startPage();
    //    List<SysDictDataDO> list = dictDataService.selectDictDataList(dictData);
    //    return getDataTable(list);
    //}

    @PostMapping("/list")
    @RequiresPermissions("system:dict:list")
    @ResponseBody
    public List<SysDictDataDO> list(SysDictDataDO dictData, @RequestParam("dictType") String dictType) {
        //startPage();
        if (dictData == null) {
            dictData = new SysDictDataDO();
        }

        if (dictType != null) {
            dictData.setDictType(dictType);
        }

        List<SysDictDataDO> list = dictDataService.selectDictDataList(dictData);
        return list;
    }

    @Log(title = "字典数据", businessType = BusinessType.EXPORT)
    @RequiresPermissions("system:dict:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysDictDataDO dictData) {
        List<SysDictDataDO> list = dictDataService.selectDictDataList(dictData);
        ExcelUtil<SysDictDataDO> util = new ExcelUtil<SysDictDataDO>(SysDictDataDO.class);
        return util.exportExcel(list, "字典数据");
    }

    /**
     * 新增字典类型
     */
    @GetMapping("/add/{dictType}")
    public String add(@PathVariable("dictType") String dictType, ModelMap mmap) {
        mmap.put("parentCode", 0);
        if (dictType.matches("^\\d*$")) {
            //若是数组，说明是添加子项
            Long dictCode = Long.parseLong(dictType);
            mmap.put("parentCode", dictCode);
            SysDictDataDO sysDictDataDO = dictDataService.selectDictDataById(dictCode);
            if (sysDictDataDO != null) {
                dictType = sysDictDataDO.getDictType();
            }
        }
        mmap.put("dictType", dictType);
        return prefix + "/add";
    }

    /**
     * 新增保存字典类型
     */
    @Log(title = "字典数据", businessType = BusinessType.INSERT)
    @RequiresPermissions("system:dict:add")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Validated SysDictDataDO dict) {
        dict.setCreateBy(ShiroUtils.getLoginName());
        return toAjax(dictDataService.insertDictData(dict));
    }

    /**
     * 修改字典类型
     */
    @GetMapping("/edit/{dictCode}")
    public String edit(@PathVariable("dictCode") Long dictCode, ModelMap mmap) {
        mmap.put("dict", dictDataService.selectDictDataById(dictCode));
        return prefix + "/edit";
    }

    /**
     * 修改保存字典类型
     */
    @Log(title = "字典数据", businessType = BusinessType.UPDATE)
    @RequiresPermissions("system:dict:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@Validated SysDictDataDO dict) {
        dict.setUpdateBy(ShiroUtils.getLoginName());
        return toAjax(dictDataService.updateDictData(dict));
    }

    @Log(title = "字典数据", businessType = BusinessType.DELETE)
    @RequiresPermissions("system:dict:remove")
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(dictDataService.deleteDictDataByIds(ids));
    }
}
