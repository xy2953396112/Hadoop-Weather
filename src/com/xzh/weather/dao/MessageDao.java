package com.xzh.weather.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import com.xzh.weather.entity.Message;
import com.xzh.weather.entity.User;
import com.xzh.weather.mybatis.util.MyBatisUtil;

@Repository
public class MessageDao {
   
		//����������Ϣ
		public Boolean addMessage(Message mess) throws IOException{
			
			SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
			SqlSession session = sessionFactory.openSession();
		    String str = "com.xzh.weather.dao.MessageMapper"+".addMessage";
		    int  flag = session.insert(str,mess);
		    session.commit();
		    session.close();
		    if(flag==1){
		    	return true;
		    	}else{
		    		return false;
		    	}
		}
		
		
		//�鿴����������Ϣ
		public List<Message> showMessages() throws IOException{
			SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
			SqlSession session = sessionFactory.openSession();
		    String str = "com.xzh.weather.dao.MessageMapper"+".showMessages";
		    List<Message>  list = session.selectList(str);
		    session.commit();
		    session.close();
		    return list;
		}
	  
}
