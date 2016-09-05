package com.wangxiang.dao;
//单元测试类
import com.wangxiang.dao.UserDaoImpl;
import com.wangxiang.entity.User;

public class test {
public static void main(String[] args) {
	UserDao  ss=new UserDaoImpl();
	/*	User user=new User();
	user.setId(2);
	user.setEmail("cfds");
	user.setPassword("dxgvfd");
	user.setUserName("vmidfj");
	ss.saveUser(user);*/
//	ss.CheckUserName("admin");
	ss.CheckEmail("111111@.com");
}
}
