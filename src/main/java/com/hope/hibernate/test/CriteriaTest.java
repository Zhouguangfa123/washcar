package com.hope.hibernate.test;

import com.hope.hibernate.common.HibernateUtils;
import com.hope.hibernate.domain.UserInfoBean;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.List;

/**
 * CriteriaTest
 *
 * @author zhougf
 * @date 2019/7/22
 */
public class CriteriaTest {

    @Test
    public void listUser() {
        Session session = HibernateUtils.openSession();
        //¿ªÆôÊÂÎñ
        Transaction tx = session.beginTransaction();
        List<UserInfoBean> list =  session.createCriteria(UserInfoBean.class).list();
        tx.commit();
        session.close();
    }
}
