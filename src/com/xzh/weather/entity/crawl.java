package com.xzh.weather.entity;

import java.util.Date;

public class crawl extends Scrapy{
	private Integer id;
	private String cityDate;
	private String week;
	private String img;
	private String temperature;
	private String weather;
	private String wind;
	private Date date;
	public crawl(Integer id, String cityDate, String week, String img,
			String temperature, String weather, String wind, Date date) {
		super();
		this.id = id;
		this.cityDate = cityDate;
		this.week = week;
		this.img = img;
		this.temperature = temperature;
		this.weather = weather;
		this.wind = wind;
		this.date = date;
	}
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
