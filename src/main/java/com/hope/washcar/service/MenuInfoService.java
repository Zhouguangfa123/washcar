package com.hope.washcar.service;

import com.hope.washcar.bean.MenuInfoBean;

import java.util.List;

/**
 * MenuInfoService
 *
 * @author zhougf
 * @date 2019/6/24
 */
public interface MenuInfoService {
    /**
     * listMenuInfoByUserId 根据userId查询用户应显示的菜单
     * @param  userId 用户ID
     * @return List
     */
    List<MenuInfoBean> listLevelOneMenuInfoByUserId(Integer userId);
}
