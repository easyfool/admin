package com.github.wangfeng.procure.admin.web.system;

import com.github.wangfeng.procure.common.constant.Global;
import com.github.wangfeng.procure.common.controller.BaseController;
import com.github.wangfeng.procure.common.po.entity.primary.SysMenuDO;
import com.github.wangfeng.procure.common.po.entity.primary.SysUserDO;
import com.github.wangfeng.procure.core.utils.ShiroUtils;
import com.github.wangfeng.procure.service.system.SysMenuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页 业务处理
 * 
 * @author wangfeng
 */
@Controller
public class SysIndexController extends BaseController
{
    @Autowired
    private SysMenuService menuService;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        SysUserDO user = ShiroUtils.getSysUser();
        // 根据用户id取出菜单
        List<SysMenuDO> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("copyrightYear", Global.getCopyrightYear());
        mmap.put("demoEnabled", Global.isDemoEnabled());
        return "index";
    }

    // 切换主题
    @GetMapping("/system/switchSkin")
    public String switchSkin(ModelMap mmap)
    {
        return "skin";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        mmap.put("version", Global.getVersion());
        return "main";
    }
}
