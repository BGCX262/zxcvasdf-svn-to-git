package org.lbs.friend.model;

import java.sql.Timestamp;

public class User {
	//用户id
   private long id;
    //用户名
   private String userName;
    //密码
   private String password;
   //登录时间
   private Timestamp loginTime;
   //注册时间
   private Timestamp registerTime;

	public synchronized long getId() {
		return id;
	}

	public synchronized void setId(long id) {
		this.id = id;
	}

	public synchronized String getUserName() {
		return userName;
	}

	public synchronized void setUserName(String userName) {
		this.userName = userName;
	}

	public synchronized String getPassword() {
		return password;
	}

	public synchronized void setPassword(String password) {
		this.password = password;
	}

	public synchronized Timestamp getLoginTime() {
		return loginTime;
	}

	public synchronized void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	public synchronized Timestamp getRegisterTime() {
		return registerTime;
	}

	public synchronized void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}
}
