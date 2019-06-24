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
     * listMenuInfoByUserId ����userId��ѯ�û�Ӧ��ʾ�Ĳ˵�
     * @param  userId �û�ID
     * @return List
     */
    List<MenuInfoBean> listLevelOneMenuInfoByUserId(Integer userId);
}
