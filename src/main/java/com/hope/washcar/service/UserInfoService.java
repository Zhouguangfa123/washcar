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
     * getUserInfoList ��ȡ�û��б�
     *
     * @param  userInfoBean �û�bean����
     * @return Map
     */
    Map<String,Object> getUserInfoList(UserInfoBean userInfoBean);
}
