package com.xzh.weather.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.xzh.weather.entity.Log;
import com.xzh.weather.entity.Message;
import com.xzh.weather.mybatis.util.MyBatisUtil;

@Repository
public class LogDao {
      
	//增加日志信息
	public Boolean addLog(Log log) throws IOException{
				SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
				SqlSession session = sessionFactory.openSession();
			    String str = "com.xzh.weather.dao.LogMapper"+".addLog";
			    int  flag = session.insert(str,log);
			    session.commit();
			    session.close();
			    if(flag==1){
			    	return true;
			    	}else{
			    		return false;
			    	}
	}
	
	//展示日志信息
	public List<Log> showLog() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.LogMapper"+".showLog";
		List<Log>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
}
