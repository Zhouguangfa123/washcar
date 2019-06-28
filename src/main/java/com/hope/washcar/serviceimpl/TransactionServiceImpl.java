package com.hope.washcar.serviceimpl;

import com.hope.washcar.dao.UserInfoMapper;
import com.hope.washcar.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * TransactionServiceImpl
 *
 * @author zhougf
 * @date 2019/6/28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private UserInfoMapper userInfoDao;

    /**若想对某部分代码不加事务处理掉异常即可*/
    @Override
    public int updateUser() {
        userInfoDao.updateUser();
        try {
            createException();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    /** @Transactional(propagation = Propagation.NOT_SUPPORTED) 表示对这个方法不开启事务只对重写的方法可以使用*/
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void createException(){
        String str = "xx";
        str.substring(0,8);
    }
}
