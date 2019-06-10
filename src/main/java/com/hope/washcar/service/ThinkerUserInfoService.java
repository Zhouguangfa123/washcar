package com.hope.washcar.service;

import com.hope.washcar.bean.ThinkerUserInfoBean;

import java.util.Map;

/**
 * ThinkerUserInfoService
 *
 * @author zhougf
 * @date 2019/05/29
 */
public interface ThinkerUserInfoService {
    ThinkerUserInfoBean countCustomer();

    Map<String, ThinkerUserInfoBean> getUserInfoLit(ThinkerUserInfoBean userInfoBean);
}
