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
     * getUserInfoList 获取用户列表
     *
     * @param  userInfoBean 用户bean对象
     * @return List
     */
    List<UserInfoBean> getUserInfoList(UserInfoBean userInfoBean);
}
