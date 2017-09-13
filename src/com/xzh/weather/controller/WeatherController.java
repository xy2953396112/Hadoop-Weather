package com.xzh.weather.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;






import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


import net.sf.json.JsonConfig;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xzh.weather.dao.WeatherDao;
import com.xzh.weather.entity.Scrapy;
import com.xzh.weather.entity.Weather;
import com.xzh.weather.entity.Weather_pm;
import com.xzh.weather.entity.crawl;
import com.xzh.weather.util.DateJsonValueProcessor;

@RequestMapping("/login")
@Controller
public class WeatherController {
    
	@Autowired
	private WeatherDao wd;
	
	//@Autowired
	//private Weather_pmMapper wp;
	
	//按日期展示天气信息
	@RequestMapping("/showWeatherByDate")
	public String showWeatherByDate(String date,Map<String, Object> map) throws IOException{
		List<Weather> list = wd.showWeatherByDate(date);
		if(list!=null){
		map.put("showWeatherByDate",list);
		   return "showWeatherByDate";
		}else{
		   return "inputDate";	
		}
		
	} 
	
	//按城市展示天气信息
	@RequestMapping("/showWeatherByCity")
	public String showWeatherByCity(String city,Map<String, Object> map) throws IOException{
		List<Weather> list = wd.showWeatherByDate(city);
		if(list!=null){
		map.put("showWeatherByDate",list);
		   return "showWeatherByCity";
		}else{
		   return "inputCity";	
		}
	} 
	
	//展示所有天气信息
	@RequestMapping("/showWeather")
	public String showWeather(Map<String, Object> map) throws IOException{
		
		map.put("showWeather",wd.showWeather());
		
		return "showWeather";
	}
	
	
	//请求JSON
	@ResponseBody
	@RequestMapping(value="/showWeatherJSON",produces = "text/json;charset=UTF-8")
	public  Object showWeatherJSON() throws IOException{
			System.out.println("wd.showWeather()"+wd.showWeather());
			return JSONArray.fromObject(wd.showWeather());
		}
	
	//把从天气网站API上的JSON数据写入数据库
	//@ResponseBody
	@RequestMapping(value="/insertWeatherJSON")
	public  Object insertWeatherJSON(HttpServletRequest req) throws IOException{
		   String json = req.getParameter("json");	
		   if(json==null){
			   return "没有将JSON数据写入数据库";
		   }
		  
		   //wd.addWeatherJSON(json);
		   return "redirect://showWeatherApi";
		   
	}
	//把数据库天气信息API的信息查出来
	@RequestMapping(value="/showWeatherApi")
	public  String showWeatherApi(Map<String, Object> map) throws IOException{
		   
		  map.put("showWeatherApi",wd.showWeatherJSON());
		   
		   return "showWeatherApi";
		   
	}
	
	//删除天气信息
	@RequestMapping("/deleteWeather")
	public String deleteWeather(@RequestParam("id") int id) throws IOException{
		
		if(wd.deleteWeather(id)){
			return "redirect://showWeather";
		}else{
			return "error";
		}		
	
	}
	
	//增加天气信息
	@RequestMapping("/addWeather")
	public String addWeather(Weather we) throws IOException{
		
		if(wd.addWeather(we)){
			return "redirect://showWeather";
		}else{
			return "error";
		}
		
	}
	
	//把天气信息转化为Excel
	@RequestMapping("/weatherToExcel")
	public String weatherToExcel(Map<String,Object> map) throws IOException{
			
           map.put("weatherToExcel",wd.showWeather());
		
		return "weatherToExcel";
			
	}
	//展示所有历史爬虫信息
	@RequestMapping("/showScrapy")
	public String showScrapy(Map<String,Object> map) throws IOException{
					
		           map.put("showScrapy",wd.showScrapy());
				
				return "showScrapy";
					
	}
	
	//展示今日天气信息
	@RequestMapping("/showTodayWeather")
	public String showTodayWeather(Map<String,Object> map) throws IOException{
						
			       map.put("showScrapy",wd.showTodayWeather());
					
				   return "showScrapy";
						
		}
	
	//展示今天太原的天气状况
	@RequestMapping("/showTodayStatus")
	@ResponseBody
	public JSONObject  showTodayStatus(Map<String,Object> map) throws IOException{
		
		
		Scrapy sc = wd.showTodayStatus();
		JsonConfig config = new JsonConfig();
		config.setIgnoreDefaultExcludes(false);
		config.registerJsonValueProcessor(Date.class,new DateJsonValueProcessor("yyyy-MM-dd"));// HH:mm:ss
		
		map.put("showTodayStatus",JSONObject.fromObject(sc,config));
		System.out.println("showTodayStatus"+map.size());
		return JSONObject.fromObject(map);
	}
	//展示太原一周内的气温变化
	@RequestMapping("/showWeekStatus")
	@ResponseBody
	public JSONObject  showWeekStatus(Map<String,Object> map) throws IOException{
			
			JsonConfig config = new JsonConfig();
			config.setIgnoreDefaultExcludes(false);
			config.registerJsonValueProcessor(Date.class,new DateJsonValueProcessor("yyyy-MM-dd"));// HH:mm:ss
			map.put("showWeekStatus",JSONArray.fromObject(wd.showWeekStatus(),config));
			
			return JSONObject.fromObject(map);
		}
	
	//把爬虫信息转化为Excel
	@RequestMapping("/todayToExcel")
		public String todayToExcel(Map<String,Object> map) throws IOException{
					
		           map.put("todayToExcel",wd.showTodayWeather());
				
				return "todayToExcel";
					
		}
	
	//把爬虫信息转化为Excel
	@RequestMapping("/scrapyToExcel")
	public String scrapyToExcel(Map<String,Object> map) throws IOException{
				
	           map.put("scrapyToExcel",wd.showScrapy());
			
			return "scrapyToExcel";
				
	}
	//把爬虫信息转化为JSON
	@RequestMapping("/scrapyToJSON")
	public  @ResponseBody Object scrapyToJSON(Map<String,Object> map) throws IOException{
					
		        map.put("scrapy",wd.showScrapy());
				
			return JSONObject.fromObject(map);
					
	}
	
	/*//把天气信息存入Mysql
	@RequestMapping("/weatherToMysql")
	public @ResponseBody String weatherToMysql(HttpServletRequest req) throws IOException{
		int flag=0;
		String result = req.getParameter("result");
		if (result != null) {
			JSONArray jsonArray = JSONArray.fromObject(result);
			
			List<Weather_pm> listResult = (List<Weather_pm>) JSONArray.toList(jsonArray, Weather_pm.class);
            System.out.println("listResult；"+listResult);
			for(Weather_pm weather_pm: listResult){

			   flag = wp.insert(weather_pm);
			}
			if(flag==1){ return "success";} 
			
		}
	    return "false";
	}*/
	
	
}
