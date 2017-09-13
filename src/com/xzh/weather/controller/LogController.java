package com.xzh.weather.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xzh.weather.dao.LogDao;
import com.xzh.weather.entity.Log;

@RequestMapping("/login")
@Controller
public class LogController {
    
	@Autowired
	private LogDao ld;
	
	//展示日志信息
	@RequestMapping("/showLog")
	public String showLog(Map<String,Object> map) throws IOException{

        map.put("showLog", ld.showLog());
		
		return "showLog";
	}
}
