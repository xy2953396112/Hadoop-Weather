package com.xzh.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {
     
	@RequestMapping("/uploadFile")
	public String uploadFile(){
		
		return "uploadFile";
	}
	
	@RequestMapping("/downloadFile")
	public String downloadFile(){
		
		return "downloadFile";
	}
} 
