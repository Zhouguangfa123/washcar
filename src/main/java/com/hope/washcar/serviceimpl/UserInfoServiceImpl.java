package com.hope.washcar.serviceimpl;

import com.hope.washcar.bean.UserInfoBean;
import com.hope.washcar.dao.UserInfoMapper;
import com.hope.washcar.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserInfoServiceImpl
 *
 * @author zhougf
 * @date 2019/6/11
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoDao;

    @Override
    public Map<String,Object> getUserInfoList(UserInfoBean userInfoBean) {
        Map<String,Object> resultMap = new HashMap<>(8);
        List<UserInfoBean> userInfoList = userInfoDao.getUserInfoList(userInfoBean);
        resultMap.put("data", userInfoList);
        return resultMap;
    }
}
