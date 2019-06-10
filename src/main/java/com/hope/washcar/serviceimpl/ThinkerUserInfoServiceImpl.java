package com.hope.washcar.serviceimpl;

import com.hope.washcar.bean.ThinkerUserInfoBean;
import com.hope.washcar.bean.UserInfoBean;
import com.hope.washcar.dao.ThinkerUserInfoMapper;
import com.hope.washcar.service.ThinkerUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * UserInfoServiceImpl
 *
 * @author zhougf
 * @date 2019/05/29
 */
@Service
public class ThinkerUserInfoServiceImpl implements ThinkerUserInfoService {
    @Autowired
    private ThinkerUserInfoMapper userInfoDao;

    @Override
    public ThinkerUserInfoBean countCustomer() {
        return  userInfoDao.countCustomer();
    }

    @Override
    public Map<String, ThinkerUserInfoBean> getUserInfoLit(ThinkerUserInfoBean userInfoBean) {
        Map<String, ThinkerUserInfoBean> resultMap = new HashMap<>();
        ThinkerUserInfoBean resultUser = new ThinkerUserInfoBean();
        //获取收款总额
        BigDecimal countCollection = userInfoDao.countCollection(userInfoBean);
        //获取使用客户量
        Long customerUseing = userInfoDao.customerUseing(userInfoBean);
        resultUser.setCollectionCount(countCollection);
        resultUser.setCustomerUseing(customerUseing);
        resultMap.put("userInfo", resultUser);
        return resultMap;
    }
}
