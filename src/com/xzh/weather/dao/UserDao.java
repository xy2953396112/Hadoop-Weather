package com.xzh.weather.dao;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import com.xzh.weather.entity.User;
import com.xzh.weather.mybatis.util.MyBatisUtil;

@Repository
public class UserDao {
      
	public static SqlSession mapper() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		return session;
	}
	
	@Test
	//登录
	public Boolean login(User user) throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
	    String str = "com.xzh.weather.dao.UserMapper"+".login";
	    User us = session.selectOne(str,user);
	    System.out.println(us);
	    session.commit();
	    session.close();
	    if(us!=null){
	    	return true;
	    	}else{
	    		return false;
	    	}
	    
	}
	
	
	
	//增加用户
	public Boolean insertUser(User user) throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		    String str = "com.xzh.weather.dao.UserMapper"+".addUser";
		    user.setRole("users");  user.setLastLoginTime(new java.sql.Date(new Date().getTime()));
		    int flag = session.insert(str,user);
		    System.out.println("insertUser:"+flag);
		    session.commit();
		    session.close();
			return true;
	}
	
	//通过Id得到用户信息
	public User getUserById(int id) throws IOException {
		String str = "com.xzh.weather.dao.UserMapper"+".getUser";
		User user =  mapper().selectOne(str,id);
		mapper().close();
		return user;
	}
	//通过用户名得到用户信息
	public User getUserByUsername(String username) throws IOException {
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.UserMapper"+".getUserByUsername";
		User user =  session.selectOne(str,username);
		session.close();
			return user;
	}
	//查找所有用户
	public List<User> getUsers() throws IOException{
		List<User> list = new ArrayList<>();
		String str = "com.xzh.weather.dao.UserMapper"+".getAllUsers";
		list =  mapper().selectList(str);
		return list;
	}
	//查询用户是否存在
	public Boolean getUsername(String username) throws IOException{
		User user = new User();
		String str = "com.xzh.weather.dao.UserMapper"+".getUsername";
		user =  mapper().selectOne(str, username);
		if(user!=null){
			return true;
		}
		return false;
	}
	//删除用户
	public Boolean deleteUser(int id) throws IOException {
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.UserMapper"+".deleteUser";
		int flag = session.delete(str,id);
		System.out.println("insertUser:"+flag);
		session.commit();
		session.close();
		if(flag==1){return true;}else{ return false;} 
	}
	
	
	//更新用户信息
	public Boolean updateUser(User user) throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
	    String str = "com.xzh.weather.dao.UserMapper"+".updateUser";
	    int flag= session.update(str,user);
	    //System.out.println(us);
	    session.commit();
	    session.close();
	    if(flag==1){return true;}else{ return false;} 
	}
    
	//增加管理员
	public void insertAdmin(User user) throws IOException {
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		    String str = "com.xzh.weather.dao.UserMapper"+".addUser";
		    //SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		    //System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		    user.setRole("admin");  user.setLastLoginTime(new java.sql.Date(new Date().getDate()));
		    int flag = session.insert(str,user);
		    System.out.println("insertAdmin:"+flag);
		    session.commit();
		    session.close();
			
		
	}
    //更新管理员信息
	public Boolean updateAdmin(User user) throws IOException {
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
	    String str = "com.xzh.weather.dao.UserMapper"+".updateAdmin";
	    int flag= session.update(str,user);
	    //System.out.println(us);
	    session.commit();
	    session.close();
	    if(flag==1){return true;}else{ return false;} 
	}
	
	
	
	
}
