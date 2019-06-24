package com.hope.washcar.dao;

import com.hope.washcar.bean.MenuInfoBean;

import java.util.List;

public interface MenuInfoBeanMapper {
    /**
     *  deleteByPrimaryKey 根据主键删除
     * @param menuId 菜单ID
     * @return int
     */
    int deleteByPrimaryKey(Integer menuId);

    /**
     *  insert 插入菜单记录
     * @param record 菜单对象
     * @return int
     */
    int insert(MenuInfoBean record);

    /**
     *  insertSelective 插入菜单记录（已配置的）
     * @param record 菜单对象
     * @return int
     */
    int insertSelective(MenuInfoBean record);

    /**
     *  selectByPrimaryKey 插入菜单记录
     * @param menuId 菜单ID
     * @return MenuInfoBean
     */
    MenuInfoBean selectByPrimaryKey(Integer menuId);

    /**
     *  updateByPrimaryKeySelective 根据主键更新菜单记录（已配置）
     * @param record 菜单对象
     * @return int
     */
    int updateByPrimaryKeySelective(MenuInfoBean record);

    /**
     *  updateByPrimaryKey 根据主键更新菜单记录
     * @param record 菜单对象
     * @return int
     */
    int updateByPrimaryKey(MenuInfoBean record);

    /**
     * listLevelOneMenuInfoByUserId 根据userId查询用户应显示的菜单
     * @param  userId 用户ID
     * @return List
     */
    List<MenuInfoBean> listLevelOneMenuInfoByUserId(Integer userId);
}