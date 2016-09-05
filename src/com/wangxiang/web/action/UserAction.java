package com.wangxiang.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wangxiang.dao.UserDao;
import com.wangxiang.dao.UserDaoImpl;
import com.wangxiang.entity.User;

public class UserAction extends ActionSupport {
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String execute() throws Exception {
		UserDao userdao=new UserDaoImpl();
	Boolean  mm1= userdao.CheckUserName(user.getUseName());
	Boolean  mm2= userdao.CheckEmail(user.getEmail());
		if(mm1&&mm2){
	
			this.addFieldError("errorname", "用户名或邮箱已被注册");
			return  "input";
		}else{
			System.out.println(user.getId()+user.getEmail()+user.getUseName()+user.getPassword());
			userdao.saveUser(user);
			return "loginSuccess";
		}
		
	}
}
