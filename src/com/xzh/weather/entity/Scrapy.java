package com.xzh.weather.entity;

import java.sql.Date;



public class Scrapy {
   
	private Integer id;
	private String cityDate;
	private String week;
	private String img;
	private String temperature;
	private String weather;
	private String wind;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCityDate() {
		return cityDate;
	}
	public void setCityDate(String cityDate) {
		this.cityDate = cityDate;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
