package com.xzh.weather.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;





import com.xzh.weather.dao.HiveDao;
import com.xzh.weather.dao.WeatherDao;
import com.xzh.weather.entity.CityMonth;
import com.xzh.weather.entity.Ty_2014_day;
import com.xzh.weather.entity.Ty_2014_year;
import com.xzh.weather.entity.Ty_2015_day;
import com.xzh.weather.entity.Ty_2016_day;
import com.xzh.weather.entity.Ty_quarter;
import com.xzh.weather.entity.Ty_three;
import com.xzh.weather.entity.Ty_week;
import com.xzh.weather.entity.Weather;
import com.xzh.weather.entity.Weather_avg;
import com.xzh.weather.entity.Weather_day;
import com.xzh.weather.entity.Weather_max_min;
import com.xzh.weather.entity.Weather_year;

@RequestMapping("/login")
@Controller
public class HiveController {
	@Autowired
	private HiveDao cm;
	
	//所有城市的气温变化情况
	@RequestMapping("/showCityMonth")
	public String showCitymonth(Map<String, Object> map) throws IOException{
			List<CityMonth> list = cm.showCityMonth();
			if(list!=null){
			map.put("showCityMonth",list);
			   return "showCityMonth";
			}else{
			   return "inputDate";	
			}
			
	} 
	
	@RequestMapping("/showTy_2014_day")
	public String showTy_2014_day(Map<String, Object> map) throws IOException{
				List<Ty_2014_day> list = cm.showTy_2014_day();
				if(list!=null){
				map.put("showTy_2014_day",list);
				   return "showTy_2014_day";
				}else{
				   return "inputDate";	
				}
				
		} 
	@RequestMapping("/showTy_2015_day")
	public String showTy_2015_day(Map<String, Object> map) throws IOException{
				List<Ty_2015_day> list = cm.showTy_2015_day();
				if(list!=null){
				map.put("showTy_2014_day",list);
				   return "showTy_2014_day";
				}else{
				   return "inputDate";	
				}
				
		} 
	
	@RequestMapping("/showTy_2016_day")
	public String showTy_2016_day(Map<String, Object> map) throws IOException{
				List<Ty_2016_day> list = cm.showTy_2016_day();
				if(list!=null){
				map.put("showTy_2014_day",list);
				   return "showTy_2014_day";
				}else{
				   return "inputDate";	
				}
				
		} 
	
	@RequestMapping("/showTy_2014_year")
	public String showTy_2014_year(Map<String, Object> map) throws IOException{
				List<Ty_2014_year> list = cm.showTy_2014_year();
				if(list!=null){
				map.put("showTy_2014_year",list);
				   return "showTy_2014_year";
				}else{
				   return "inputDate";	
				}
				
				
		} 
	
	@RequestMapping("/showTy_2015_year")
	public String showTy_2015_year(Map<String, Object> map) throws IOException{
				List<Ty_2014_year> list = cm.showTy_2015_year();
				if(list!=null){
				map.put("showTy_2014_year",list);
				   return "showTy_2014_year";
				}else{
				   return "inputDate";	
				}
				
				
		} 
	@RequestMapping("/showTy_2016_year")
	public String showTy_2016_year(Map<String, Object> map) throws IOException{
				List<Ty_2014_year> list = cm.showTy_2016_year();
				if(list!=null){
				map.put("showTy_2014_year",list);
				   return "showTy_2014_year";
				}else{
				   return "inputDate";	
				}
				
				
		} 
	
	@RequestMapping("/showTy_2014_week")
	public String showTy_2014_week(Map<String, Object> map) throws IOException{
				List<Ty_week> list = cm.showTy_2014_week();
				if(list!=null){
				map.put("showTy_week",list);
				   return "showTy_week";
				}else{
				   return "inputDate";	
				}	
		} 
	
	@RequestMapping("/showTy_2015_week")
	public String showTy_2015_week(Map<String, Object> map) throws IOException{
				List<Ty_week> list = cm.showTy_2015_week();
				if(list!=null){
				map.put("showTy_week",list);
				   return "showTy_week";
				}else{
				   return "inputDate";	
				}	
		} 
	@RequestMapping("/showTy_2016_week")
	public String showTy_2016_week(Map<String, Object> map) throws IOException{
				List<Ty_week> list = cm.showTy_2016_week();
				if(list!=null){
				map.put("showTy_week",list);
				   return "showTy_week";
				}else{
				   return "inputDate";	
				}	
		} 
	
	@RequestMapping("/showTy_2014_quarter")
	public String showTy_2014_quarter(Map<String, Object> map) throws IOException{
				List<Ty_quarter> list = cm.showTy_2014_quarter();
				
				map.put("showTy_quarter",list);
				   return "showTy_quarter";
		}
	@RequestMapping("/showTy_2015_quarter")
	public String showTy_2015_quarter(Map<String, Object> map) throws IOException{
				List<Ty_quarter> list = cm.showTy_2015_quarter();
				
				map.put("showTy_quarter",list);
				   return "showTy_quarter";
		}
	@RequestMapping("/showTy_2016_quarter")
	public String showTy_2016_quarter(Map<String, Object> map) throws IOException{
				List<Ty_quarter> list = cm.showTy_2016_quarter();
				
				map.put("showTy_quarter",list);
				   return "showTy_quarter";
		}
	
	
	@RequestMapping("/showTy_three")
	public String showTy_three(Map<String, Object> map) throws IOException{
				List<Ty_three> list = cm.showTy_three();
				if(list!=null){
				map.put("showTy_three",list);
				   return "showTy_three";
				}else{
				   return "inputDate";	
				}
				
				
		} 
	@RequestMapping("/showWeather_avg")
	public String showWeather_avg(Map<String, Object> map) throws IOException{
				List<Weather_avg> list = cm.showWeather_avg();
				if(list!=null){
				map.put("showWeather_avg",list);
				   return "showWeather_avg";
				}else{
				   return "inputDate";	
				}
				
		} 
	@RequestMapping("/showWeather_day")
	public String showWeather_day(Map<String, Object> map) throws IOException{
				List<Weather_day> list = cm.showWeather_day();
				if(list!=null){
				map.put("showWeather_day",list);
				   return "showWeather_day";
				}else{
				   return "inputDate";	
				}
				
		} 
	
	@RequestMapping("/showWeather_max_min")
	public String showWeather_max_min(Map<String, Object> map) throws IOException{
				List<Weather_max_min> list = cm.showWeather_max_min();
				if(list!=null){
				map.put("showWeather_max_min",list);
				   return "showWeather_max_min";
				}else{
				   return "inputDate";	
				}
				
		} 
	
	@RequestMapping("/showWeather_year")
	public String showWeather_year(Map<String, Object> map) throws IOException{
				List<Weather_year> list = cm.showWeather_year();
				if(list!=null){
				map.put("showWeather_year",list);
				   return "showWeather_year";
				}else{
				   return "inputDate";	
				}
				
		} 
}
