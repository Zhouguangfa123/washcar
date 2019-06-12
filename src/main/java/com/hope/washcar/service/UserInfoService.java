package com.hope.washcar.service;

import com.hope.washcar.bean.UserInfoBean;

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
}
