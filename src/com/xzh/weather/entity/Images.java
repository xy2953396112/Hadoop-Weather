package com.xzh.weather.entity;

public class Images {
    private int id;
    private String name;
    private String path;
    private int size;
	
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getFullPath(){
    	return path+name;
    }

	@Override
	public String toString() {
		return "Images [id=" + id + ", name=" + name + ", path=" + path
				+ ", size=" + size + "]";
	}
	
	
}
