package com.hope.washcar.dao;

import com.hope.washcar.bean.ThinkerUserInfoBean;

import java.math.BigDecimal;

/**
 * ThinkerUserInfoMapper
 *
 * @author zhougf
 * @date 2019/05/29
 */
public interface ThinkerUserInfoMapper {
    ThinkerUserInfoBean countCustomer();

    /**收款总额*/
    BigDecimal countCollection(ThinkerUserInfoBean userInfo);

    /**收款总额*/
    Long customerUseing(ThinkerUserInfoBean userInfo);


}
