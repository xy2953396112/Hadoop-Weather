package com.xzh.weather.entity;



import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;



public class Weather {
    
	
	private int id;
	private String city;       //城市
	private float HTemp;       //�?��温度
	private float LTemp;       //�?��温度
	private float rain;        //降雨�?	private String wind;       //风向
	private float humidity;    //湿度
	private String air;        //空气质量
	
	private String date;         //日期
	String wind;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getHTemp() {
		return HTemp;
	}
	public void setHTemp(float hTemp) {
		HTemp = hTemp;
	}
	public float getLTemp() {
		return LTemp;
	}
	public void setLTemp(float lTemp) {
		LTemp = lTemp;
	}
	public float getRain() {
		return rain;
	}
	public void setRain(float rain) {
		this.rain = rain;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public String getAir() {
		return air;
	}
	public void setAir(String air) {
		this.air = air;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	
	
	
	
}
