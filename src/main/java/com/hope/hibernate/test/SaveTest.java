package com.hope.hibernate.test;

import com.hope.hibernate.common.HibernateUtils;
import com.hope.hibernate.domain.UserInfoBean;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * SaveTest
 *
 * @author zhougf
 * @date 2019/7/22
 */
public class SaveTest {

    public void saveUser() {
        Session session = HibernateUtils.openSession();
        //开启事务
        Transaction tx = session.beginTransaction();
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.setUserName("ssss");
        userInfoBean.setUserPassword("x545");
        userInfoBean.setUserPhone("123456451");
        userInfoBean.setUserStatus("02");
        session.save(userInfoBean);
        tx.commit();
        session.close();
    }

    @Test
    public void delUser() {
        Session session = HibernateUtils.openSession();
        //开启事务
        Transaction tx = session.beginTransaction();
        UserInfoBean userInfoBean = session.get(UserInfoBean.class,1);
        session.delete(userInfoBean);
        tx.commit();
        session.close();
    }

}
