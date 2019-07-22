package com.hope.hibernate.test;

import com.hope.hibernate.domain.UserInfoBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Demo
 *
 * @author zhougf
 * @date 2019/7/19
 */
public class Demo {
    public static void main(String[] args) {
        //��������
        Configuration conf = new Configuration().configure();
        //��ȡ����
        SessionFactory sessionFactory = conf.buildSessionFactory();
        //����session
        Session session = sessionFactory.openSession();
        //��������
        Transaction tx = session.beginTransaction();
//        UserInfoBean userInfoBean = new UserInfoBean();
//        userInfoBean.setUserName("xxx");
//        userInfoBean.setUserPassword("x545");
//        userInfoBean.setUserPhone("123456451");
//        userInfoBean.setUserStatus("02");
//        session.save(userInfoBean);
//        UserInfoBean userInfoBean = session.get(UserInfoBean.class,1);
        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
