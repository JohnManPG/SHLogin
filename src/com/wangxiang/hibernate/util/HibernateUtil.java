package com.wangxiang.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//工具类
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // 创造一个sessionFactory
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);//输出异常
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}