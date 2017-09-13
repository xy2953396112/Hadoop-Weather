package com.xzh.weather.util;

import java.util.Calendar;


public class GetDate {
	
    public static void main(String[] args) {
    	java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");

    	Calendar cal = Calendar.getInstance();// ȡ��ǰ���ڡ�
    	System.out.println(cal.getTime());
    	String date = format.format(cal.getTime());
    	System.out.println(date);
	}
}
