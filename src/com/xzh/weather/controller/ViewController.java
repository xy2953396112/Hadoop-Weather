package com.xzh.weather.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xzh.weather.entity.Article;

@Controller
public class ViewController {
    
	@RequestMapping("/excelView")
	public String excelView(ModelMap map){
	    List<Article>articles = new ArrayList<Article>();
	    for(int i = 0 ; i < 5; i ++){
	        Article article = new Article();
	        article.setTitle("title" +i);
	        article.setContent("content" + i);
	        articles.add(article);
	    }
	    map.addAttribute("articles",articles);
	    return "excelView";
	}
}
