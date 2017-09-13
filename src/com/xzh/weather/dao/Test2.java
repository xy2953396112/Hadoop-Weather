package com.xzh.weather.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;




import com.xzh.weather.entity.User;
import com.xzh.weather.mybatis.util.MyBatisUtil;

public class Test2 {

	@Test
	public void testAdd() throws IOException {
		SqlSessionFactory factory = MyBatisUtil.getFactory();
		
		SqlSession session = factory.openSession();
		
		String statement = "com.xzh.weather.dao.UserMapper.addUser";
		int insert = session.insert(statement , new User());
	
		session.commit();
		
		session.close();
		
		System.out.println(insert);
	}
	
	/*@Test
	public void testUpate() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.atguigu.day03_mybaits.test2.userMapper.updateUser";
		
		int update = session.update(statement, new User(4, "KK444", 25));
		
		session.close();
		System.out.println(update);
	}
	
	@Test
	public void testDelete() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.atguigu.day03_mybaits.test2.userMapper.deleteUser";
		
		int delete = session.delete(statement, 4);
		
		session.close();
		System.out.println(delete);
	}
	
	@Test
	public void testGetUser() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.atguigu.day03_mybaits.test2.userMapper.getUser";
		
		User user = session.selectOne(statement, 1);
		
		session.close();
		System.out.println(user);
	}
	
	@Test
	public void testGetAll() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		String statement = "com.atguigu.day03_mybaits.test2.userMapper.getAllUsers";
		
		List<User> list = session.selectList(statement);
		
		session.close();
		System.out.println(list);
	}
	
	
	@Test
	public void testAdd2() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		//默认是手动提交的
		SqlSession session = factory.openSession(true);
		
		userMapper mapper = session.getMapper(userMapper.class);
		int add = mapper.add(new User(-1, "SS", 45));
		System.out.println(add);
		
		session.close();
	}*/
	
}
