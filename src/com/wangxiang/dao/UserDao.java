package com.wangxiang.dao;

import com.wangxiang.entity.User;

//定义 UserDao接口，用来实现UserDaoImpl类。

public interface UserDao {
//	检查用户名是否存在
	public Boolean CheckUserName(String username);
//	检查邮箱是否存在
	public Boolean CheckEmail(String eamail);
//	保存用户
	public void saveUser(User user);
	
}
