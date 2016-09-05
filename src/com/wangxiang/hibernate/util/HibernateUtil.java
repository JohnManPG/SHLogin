package com.wangxiang.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//������
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // ����һ��sessionFactory
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);//����쳣
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}