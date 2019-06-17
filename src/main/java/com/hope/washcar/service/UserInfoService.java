package com.hope.washcar.service;

import com.hope.washcar.bean.UserInfoBean;

import java.util.List;
import java.util.Map;

/**
 * UserInfoService
 *
 * @author zhougf
 * @date 2019/6/11
 */
public interface UserInfoService {

    /**
     * getUserInfoList 获取用户列表
     *
     * @param  userInfoBean 用户bean对象
     * @return Map
     */
    Map<String,Object> getUserInfoList(UserInfoBean userInfoBean);

    /**
     * checkUser 判断用户是否存在
     *
     * @param  userInfoBean 用户bean对象
     * @return List
     */
    List<UserInfoBean> checkUser(UserInfoBean userInfoBean);
}
