package com.xzh.weather.entity;

public class Weather_day {
   private String city;
	private Integer htemp;
	private Integer ltemp;
	private Integer avgTemp;
	private Float humidity;
	private Integer rain;
	private String date;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getHtemp() {
		return htemp;
	}
	public void setHtemp(Integer htemp) {
		this.htemp = htemp;
	}
	public Integer getLtemp() {
		return ltemp;
	}
	public void setLtemp(Integer ltemp) {
		this.ltemp = ltemp;
	}
	public Integer getAvgTemp() {
		return avgTemp;
	}
	public void setAvgTemp(Integer avgTemp) {
		this.avgTemp = avgTemp;
	}
	public Float getHumidity() {
		return humidity;
	}
	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}
	public Integer getRain() {
		return rain;
	}
	public void setRain(Integer rain) {
		this.rain = rain;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
