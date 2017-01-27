package com.bird.model;

public class Bird {
	
	private String name;
	
	private String type;
	
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", type=" + type + ", id=" + id + "]";
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
