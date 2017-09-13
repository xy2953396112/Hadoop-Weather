package com.xzh.weather.entity;

public class CityMonth {
    private String citydate;

    private Integer htemp;

    private Integer ltemp;

    private Integer temavg;

    public String getCitydate() {
        return citydate;
    }

    public void setCitydate(String citydate) {
        this.citydate = citydate;
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

    public Integer getTemavg() {
        return temavg;
    }

    public void setTemavg(Integer temavg) {
        this.temavg = temavg;
    }
}