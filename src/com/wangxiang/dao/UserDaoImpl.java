package com.wangxiang.dao;
//DAO层具体类，用来生成Session和管理数据。
import java.util.Iterator;
import java.util.List;
import org.hibernate.criterion.Example;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.criterion.Restrictions;


import com.wangxiang.dao.UserDao;
import com.wangxiang.entity.User;
import com.wangxiang.hibernate.util.HibernateUtil;

public class UserDaoImpl implements UserDao{
  //判断用户名
	public Boolean CheckUserName(String username) {

		List<User> result = null;   //list结果集
		Session session = null;     //实例session对象
		try {
		    session =  HibernateUtil.getSessionFactory().openSession();
		    Criteria criteria = session.createCriteria(User.class);//查询User类接收的数据
		    criteria.add(Restrictions.eq("useName", username));    //判断是否存在该用户名
		      result = criteria.list();
		      Iterator it = result.iterator();//迭代
		      if(it.hasNext()){
//		    	  输入用户名已存在跳转到登陆界面
		    	  System.out.println(" 输入用户名已存在");
		    	  return  true;
		      }
		   
		} catch (HibernateException e) {
		    e.printStackTrace();
		} finally{
		    session.close();//关闭会话
		}
		 return false ;
		
	}
//判断email
	public Boolean CheckEmail(String eamail) {
		List<User> result = null;
		Session session = null;
		try {
		    session =  HibernateUtil.getSessionFactory().openSession();
		    Criteria criteria = session.createCriteria(User.class);
		    criteria.add(Restrictions.eq("email", eamail));
		      result = criteria.list();
		      Iterator it = result.iterator();
		      if(it.hasNext()){
//		    	  输入邮箱已存在跳转到登陆界面
		    	  System.out.println(" 输入用户名已存在");
		    	  return  true;
		      }
		   
		} catch (HibernateException e) {
		    e.printStackTrace();
		} finally{
		    session.close();
		}
		 return false ;
	}
	
	//保存一条数据
	public void saveUser(User user) {
		Transaction tx = null;
		Session session = null;
		try {
		  session =  HibernateUtil.getSessionFactory().openSession();
		  tx=session.beginTransaction();
		  session.save(user);
		  System.out.println("用户名已保存");
		  tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
		    e.printStackTrace();
		} finally{
		    session.close();//关闭session
		}
	}

}
