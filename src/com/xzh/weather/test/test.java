package com.xzh.weather.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class test {
   public static void main(String[] args) {
	   Map<String, Object> map = new HashMap<String,Object>();
	   map.put("showWeatherJSON","12312");
	   System.out.println(JSONObject.fromObject(map));
   }
}
