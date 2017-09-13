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
public class LoginController {
     
	@Autowired
	private UserDao ud; 
	@Autowired
	private LogDao ld;
	
	@RequestMapping("/landlogin")
	public String landLogin(){
		
		return "login/login";
	}
	
	
	
	
	//----------------------登录------------------------------
	@RequestMapping(value="/login")
	public  String login(User user,HttpSession sesssion) throws Exception {
			
		    String ip = InetAddress.getLocalHost().getHostAddress();
			Log log = new Log(user.getUsername(),new Date(),ip);
			
			if(user.getUsername()==null ||  user.getPassword()==null || user.getRole()==null){
				return "redirect:/landlogin";
			}
			
			if(user.getRole().equals("users")&&ud.login(user)){
                ld.addLog(log);
				sesssion.setAttribute("user",user);
	                    
				return "backstage/userSuccess";
				
			}else if(user.getRole().equals("admin")&&ud.login(user)){
				ld.addLog(log);
				sesssion.setAttribute("user",user);
	            
		    	return "backstage/adminSuccess";
		    	
			}else{
				
				if(user.getUsername()==null||user.getPassword()==null||user.getRole()==null){
					
					return "redirect:/login";
				}
			  	
			    return "redirect:/login";
			}
				
		}
	
	
}
