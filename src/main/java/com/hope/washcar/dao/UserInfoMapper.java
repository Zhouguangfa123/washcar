package com.hope.washcar.dao;

import com.hope.washcar.bean.UserInfoBean;

import java.util.List;

/**
 * UserInfoMapper
 *
 * @author zhougf
 * @date 2019/6/11
 */
public interface UserInfoMapper {
    /**
     * getUserInfoList ��ȡ�û��б�
     *
     * @param  userInfoBean �û�bean����
     * @return List
     */
    List<UserInfoBean> getUserInfoList(UserInfoBean userInfoBean);
}
