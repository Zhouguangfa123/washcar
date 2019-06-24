package com.hope.washcar.dao;

import com.hope.washcar.bean.MenuInfoBean;

import java.util.List;

public interface MenuInfoBeanMapper {
    /**
     *  deleteByPrimaryKey ��������ɾ��
     * @param menuId �˵�ID
     * @return int
     */
    int deleteByPrimaryKey(Integer menuId);

    /**
     *  insert ����˵���¼
     * @param record �˵�����
     * @return int
     */
    int insert(MenuInfoBean record);

    /**
     *  insertSelective ����˵���¼�������õģ�
     * @param record �˵�����
     * @return int
     */
    int insertSelective(MenuInfoBean record);

    /**
     *  selectByPrimaryKey ����˵���¼
     * @param menuId �˵�ID
     * @return MenuInfoBean
     */
    MenuInfoBean selectByPrimaryKey(Integer menuId);

    /**
     *  updateByPrimaryKeySelective �����������²˵���¼�������ã�
     * @param record �˵�����
     * @return int
     */
    int updateByPrimaryKeySelective(MenuInfoBean record);

    /**
     *  updateByPrimaryKey �����������²˵���¼
     * @param record �˵�����
     * @return int
     */
    int updateByPrimaryKey(MenuInfoBean record);

    /**
     * listLevelOneMenuInfoByUserId ����userId��ѯ�û�Ӧ��ʾ�Ĳ˵�
     * @param  userId �û�ID
     * @return List
     */
    List<MenuInfoBean> listLevelOneMenuInfoByUserId(Integer userId);
}