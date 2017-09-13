package com.xzh.weather.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.xzh.weather.entity.CityMonth;
import com.xzh.weather.entity.Log;
import com.xzh.weather.entity.Ty_2014_day;
import com.xzh.weather.entity.Ty_2014_year;
import com.xzh.weather.entity.Ty_2015_day;
import com.xzh.weather.entity.Ty_2016_day;
import com.xzh.weather.entity.Ty_quarter;
import com.xzh.weather.entity.Ty_three;
import com.xzh.weather.entity.Ty_week;
import com.xzh.weather.entity.Weather_avg;
import com.xzh.weather.entity.Weather_day;
import com.xzh.weather.entity.Weather_max_min;
import com.xzh.weather.entity.Weather_year;
import com.xzh.weather.mybatis.util.MyBatisUtil;

@Repository
public class HiveDao {
	
	public List<CityMonth> showCityMonth() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showCityMonth";
		List<CityMonth>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Ty_2014_day> showTy_2014_day() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2014_day";
		List<Ty_2014_day>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	public List<Ty_2015_day> showTy_2015_day() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2015_day";
		List<Ty_2015_day>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	public List<Ty_2016_day> showTy_2016_day() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2016_day";
		List<Ty_2016_day>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Ty_week> showTy_2014_week() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2014_week";
		List<Ty_week>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Ty_week> showTy_2015_week() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2015_week";
		List<Ty_week>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	
	
	public List<Ty_week> showTy_2016_week() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2016_week";
		List<Ty_week>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Ty_quarter> showTy_2014_quarter() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2014_quarter";
		List<Ty_quarter>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Ty_quarter> showTy_2015_quarter() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2015_quarter";
		List<Ty_quarter>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Ty_quarter> showTy_2016_quarter() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2016_quarter";
		List<Ty_quarter>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Ty_2014_year> showTy_2014_year() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2014_year";
		List<Ty_2014_year>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	
	
	public List<Ty_2014_year> showTy_2015_year() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2015_year";
		List<Ty_2014_year>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Ty_2014_year> showTy_2016_year() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_2016_year";
		List<Ty_2014_year>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	
	public List<Ty_three> showTy_three() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showTy_three";
		List<Ty_three>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Weather_avg> showWeather_avg() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showWeather_avg";
		List<Weather_avg>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Weather_day> showWeather_day() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showWeather_day";
		List<Weather_day>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Weather_max_min> showWeather_max_min() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showWeather_max_min";
		List<Weather_max_min>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	public List<Weather_year> showWeather_year() throws IOException{
		SqlSessionFactory sessionFactory = MyBatisUtil.getFactory();
		SqlSession session = sessionFactory.openSession();
		String str = "com.xzh.weather.dao.HiveMapper"+".showWeather_year";
		List<Weather_year>  list = session.selectList(str);
		session.commit();
		session.close();
		return list;
	}
	
	
}
