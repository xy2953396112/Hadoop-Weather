package com.xzh.weather.entity;

public class Message {
   
	
	private int id;
	private String name;
	private String email;
	private String note;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", name=" + name + ", email=" + email
				+ ", note=" + note + "]";
	}
	public Message(int id, String name, String email, String note) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.note = note;
	}
	public Message() {
		super();
	}
	
	
}
