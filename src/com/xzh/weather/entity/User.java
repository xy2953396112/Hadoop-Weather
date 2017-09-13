package com.xzh.weather.entity;

import java.sql.Date;





public class User{
     int id;
     String username;                 //用户名
     String password;                 //密码
	 String role;                     //角色
     Date   lastLoginTime;              //上次登录时间
     String phone;                    //手机号码
	 String sex;                     //性别
	 String address;                 //地址ַ
	 
	 
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", role=" + role + ", lastLoginTime="
				+ lastLoginTime + ", phone=" + phone + ", sex=" + sex
				+ ", address=" + address + "]";
	}
	public User(int id, String username, String password, String role,
			Date lastLoginTime, String phone, String sex, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.lastLoginTime = lastLoginTime;
		this.phone = phone;
		this.sex = sex;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User() {
		super();
	}
	public User(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
     
     
     
}
