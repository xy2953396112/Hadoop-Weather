package com.xzh.weather.controller;

import java.io.IOException;
import java.util.Map;

import javax.persistence.metamodel.MapAttribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xzh.weather.dao.MessageDao;
import com.xzh.weather.entity.Message;

@Controller
public class MessageController {
    
	@Autowired
	private MessageDao md;
	
	//留言
	@RequestMapping("/addMessage")
	public String addMessage(Message mess) throws IOException{
		 
		md.addMessage(mess);
		
		return "home";
	}
	
	//展示留言
	@RequestMapping("/showMessages")
	public String showMessages(Map<String,Object> map) throws IOException{
		
		
		map.put("showMessages",md.showMessages());
		
		return "showMessages";
	}
}
