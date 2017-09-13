package com.xzh.weather.controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import net.sf.json.JSONObject;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xzh.weather.dao.UserDao;
import com.xzh.weather.entity.User;

@RequestMapping("/login")
@Controller
public class UserController {
    
	@Autowired
	private UserDao ud;
	
	
	//注销
	@RequestMapping("/removelogin")
	public String removeLogin(HttpSession session){

			 session.removeAttribute("user");  
			 
			 return "redirect:/landlogin";
	}
	
	//增加用户信息
	@RequestMapping("/addUser")
	public String addUser(@Valid User user) throws IOException{
		
		ud.insertUser(user);
		
		return "redirect:/login/showUsers";
	}
	
	//注册
	@RequestMapping("/registerUser")
	public String registerUser(@Valid User user) throws IOException{
			
			Boolean flag = ud.insertUser(user);
			Map map = new HashMap();
			if(flag==true){
				map.put("info","用户注册成功!请登录!");
			    return "redirect:/landlogin";
			}
			else return "";
		}
	
	//增加管理员信息
	@RequestMapping("/addAdmin")
	public String addAdmin(@Valid User user) throws IOException{
			
			ud.insertAdmin(user);
			
			return "redirect:/login/showUsers";
		}
	
	//更新用户信息
	@RequestMapping("/updateUser")
	public String updateUser(User user) throws IOException{
		
		if(ud.updateUser(user)){
			
			return "redirect:/login/selectUser";
		}else{
			return "updateUser";
		}
		
		
	}
	
	//更新管理员信息
	@RequestMapping("/updateAdmin")
	public String updateAdmin(User user) throws IOException{
			
			ud.updateAdmin(user);
			
			return "redirect:/login/showUsers";
	}
	
   
    
	//通过id得到用户
	@RequestMapping("/getUser")
	public String getUser(@RequestParam("id") int id) throws IOException{
		
		ud.getUserById(id);
		
		return "redirect:/login/showUsers";
	}
	
	//通过用户名得到用户信息
	@RequestMapping("/selectUser")
	public String selectUser(HttpSession session,Map<String, Object> map) throws IOException{
		User us = (User) session.getAttribute("user");
		 
		User user = ud.getUserByUsername(us.getUsername());
		
			if(user==null){
				map.put("selectUser","没有任何信息!");
			}else{
				session.setAttribute("showUser",user);
				//map.put("selectUser",user);
			}
			   
			return "showUser";
	}
	
	//通过ID删除用户
	@RequestMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id) throws IOException{
			System.out.println();
			ud.deleteUser(id);
			
			return "redirect:/login/showUsers";
	}
		
	//查找所有用户
	@RequestMapping("/showUsers")
	public String showUsers(Map<String, Object> map) throws IOException{
		
		map.put("listUsers",ud.getUsers());
				
		return "showUsers";	
	}
	
	//查询用户是否存在
	@RequestMapping("/getUsername")
	public @ResponseBody Object getUsername(HttpServletRequest request) throws IOException{
			String username =  request.getParameter("username");
			Boolean flag =ud.getUsername(username);
					
		return JSONObject.fromObject(flag);	
	}
}
