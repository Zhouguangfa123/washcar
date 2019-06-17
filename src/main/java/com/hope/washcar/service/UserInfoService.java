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
     * getUserInfoList ��ȡ�û��б�
     *
     * @param  userInfoBean �û�bean����
     * @return Map
     */
    Map<String,Object> getUserInfoList(UserInfoBean userInfoBean);

    /**
     * checkUser �ж��û��Ƿ����
     *
     * @param  userInfoBean �û�bean����
     * @return List
     */
    List<UserInfoBean> checkUser(UserInfoBean userInfoBean);
}
