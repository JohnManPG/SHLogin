package com.wangxiang.entity;

public class User {
	private int id;
	private String useName;//用户名
	private String password;//密码
	private String email;//邮箱
	/*set和get方法*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUseName() {
		return useName;
	}
	public void setUseName(String useName) {
		this.useName = useName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
