package com.xzh.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JsonController {
     
	@RequestMapping(value="/postJson",method=RequestMethod.POST)
	public String getJson_post(){
		
		return "postJson";
	}
	
	@RequestMapping(value="/getJson_get",method=RequestMethod.GET)
	public String getJson_get(){
		
		return "getJson";
	}
}
