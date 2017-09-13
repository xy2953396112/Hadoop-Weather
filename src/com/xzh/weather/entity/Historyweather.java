package com.xzh.weather.entity;

public class Historyweather {
    private Integer id;

    private String citydate;

    private String day;

    private String htemp;

    private String ltemp;

    private String weather;

    private String wind;

    private String level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCitydate() {
        return citydate;
    }

    public void setCitydate(String citydate) {
        this.citydate = citydate;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHtemp() {
        return htemp;
    }

    public void setHtemp(String htemp) {
        this.htemp = htemp;
    }

    public String getLtemp() {
        return ltemp;
    }

    public void setLtemp(String ltemp) {
        this.ltemp = ltemp;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}