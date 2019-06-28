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

    /**�����ĳ���ִ��벻����������쳣����*/
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

    /** @Transactional(propagation = Propagation.NOT_SUPPORTED) ��ʾ�������������������ֻ����д�ķ�������ʹ��*/
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void createException(){
        String str = "xx";
        str.substring(0,8);
    }
}
