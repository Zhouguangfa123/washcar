package com.hope.hibernate.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sf;
	
	static{
		//1 ����,���ÿղι���
		Configuration conf = new Configuration().configure();
		//2 ����������Ϣ,���� SessionFactory����
		 sf = conf.buildSessionFactory();
	}
	
	//���session => ���ȫ��session
	public static Session openSession(){
				//3 ���session
				Session session = sf.openSession();
				
				return session;
		
	}
	//���session => ������̰߳󶨵�session
	public static Session getCurrentSession(){
		//3 ���session
		Session session = sf.getCurrentSession();
		
		return session;
	}
	public static void main(String[] args) {
		System.out.println(HibernateUtils.openSession());
	}
	
}
