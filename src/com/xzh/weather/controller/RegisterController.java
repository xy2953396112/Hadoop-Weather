package com.xzh.weather.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xzh.weather.dao.UserDao;
import com.xzh.weather.entity.User;

@Controller
public class RegisterController {
    
	@Autowired
	private UserDao ud;
	//зЂВс
	@RequestMapping("/register")
	public String addUser(@Valid User user) throws IOException{
			
			ud.insertUser(user);
			
			return "redirect:/landlogin";
	}
}
