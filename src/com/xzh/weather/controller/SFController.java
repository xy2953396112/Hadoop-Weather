package com.xzh.weather.controller;

import java.net.InetAddress;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xzh.weather.dao.LogDao;
import com.xzh.weather.dao.UserDao;
import com.xzh.weather.entity.Log;
import com.xzh.weather.entity.User;
@Controller
public class SFController {
     
	
	
	@RequestMapping("/SFPush")
	public String landLogin(){
		
		return "index";
	}
	
	
	
	
	
	
}
