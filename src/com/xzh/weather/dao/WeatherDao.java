package com.xzh.weather.dao;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xzh.weather.entity.Scrapy;
import com.xzh.weather.entity.User;
import com.xzh.weather.entity.Weather;
import com.xzh.weather.entity.Weather_pm;
import com.xzh.weather.entity.crawl;
import com.xzh.weather.mybatis.util.MyBatisUtil;

@Repository
public class WeatherDao {
    
	
	//增加天气信息
	public Boolean addWeather(Weather we) throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.WeatherMapper"+".dddWeather";
		int flag=  session.insert(str,we);
		session.close();
		if(flag==1){ return true;} else { return false;}
		
   
	}
	//从网站获取的JSON放入数据库
	public String addWeatherJSON(String json) throws IOException{
		    JSONArray ob = JSONArray.fromObject(json);
		    Object[] oj  = ob.toArray();
		    Weather_pm wp = new Weather_pm();
			SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
			SqlSession session = sessionFactory.openSession();
			int flag = 0;
			String str = "com.xzh.weather.dao.Weather_pmMapper"+".insertSelective";
			for(int i=0;i<oj.length;i++){
				wp = (Weather_pm) oj[i];
				flag=  session.insert(str,wp);
			}
			
			session.close();
			if(flag==1){ return "JSON数据成功传入mysql!";} 
			else { return "JSON数据失败传入mysql!";}
			
	        
		}
	
	//把从API中获取到的数据查出来
	public List<Weather_pm> showWeatherJSON() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.Weather_pmMapper"+".select";
		List<Weather_pm> list =  session.selectList(str);
		session.close();
		return list;	

	
	}
	
	//按时间查询天气信息
	public List<Weather> showWeatherByDate(String date) throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.WeatherMapper"+".getWeatherByDate";
		List<Weather> list =  session.selectList(str,date);
		session.close();
		return list;
	}
	
	//按城市查询天气信息
	public List<Weather> showWeatherByCity(String city) throws IOException{	
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.WeatherMapper"+".getWeatherByCity";
		List<Weather> list =  session.selectList(str,city);
		session.close();
		return list;
    }
		
	//展示天气信息
	public List<Weather> showWeather() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.WeatherMapper"+".showWeather";
		List<Weather> list =  session.selectList(str);
		session.close();
		
	   return list;
	}
	
	//展示爬虫信息
	public List<Scrapy> showScrapy() throws IOException{
			SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
			SqlSession session = sessionFactory.openSession();
			String str = "com.xzh.weather.dao.WeatherMapper"+".showScrapy";
			List<Scrapy> list =  session.selectList(str);
			session.close();
			
		   return list;
		}
	
	
	//展示今天天气信息
	public List<Scrapy> showTodayWeather() throws IOException{
				SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
				SqlSession session = sessionFactory.openSession();
				String str = "com.xzh.weather.dao.WeatherMapper"+".showTodayWeather";
				List<Scrapy> list =  session.selectList(str);
				session.close();
				
			   return list;
			}
	
	//展示今天太原天气信息
	public Scrapy showTodayStatus() throws IOException{
					SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
					SqlSession session = sessionFactory.openSession();
					String str = "com.xzh.weather.dao.WeatherMapper"+".showTodayStatus";
					Scrapy scrapy =  session.selectOne(str);
				
					session.close();
					
				   return scrapy;
	}
	
	//展示一周内太原气温的变化
	public List<Scrapy> showWeekStatus() throws IOException{
						SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
						SqlSession session = sessionFactory.openSession();
						String str = "com.xzh.weather.dao.WeatherMapper"+".showWeekStatus";
						List<Scrapy> scrapy =  session.selectList(str);
						session.close();
						
					   return scrapy;
	}
	
	
	
	//删除天气信息
	public Boolean deleteWeather(int id) throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.WeatherMapper"+".deleteWeather";
		int  flag =  session.delete(str,id);
		session.close();
		if(flag==1){ return true;} else { return false;}
		
	}
	
	//更新天气信息
	public Boolean updateWeather(Weather we) throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.WeatherMapper"+".updateWeather";
		int  flag =  session.update(str,we);
		session.close();
		if(flag==1){ return true;} else { return false;}
	}
}
