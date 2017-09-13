package com.xzh.weather.entity;

import java.util.Date;

public class Log {
   
	private Integer id;
	private String username;
	private Date date;
	private String note;
	private String ip;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Log(Integer id, String username, Date date, String note, String ip) {
		super();
		this.id = id;
		this.username = username;
		this.date = date;
		this.note = note;
		this.ip = ip;
	}
	public Log(String username, Date date, String ip) {
		super();
		this.username = username;
		this.date = date;
		this.ip = ip;
	}
	
	
}
