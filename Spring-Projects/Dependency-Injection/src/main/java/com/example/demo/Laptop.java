package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	int id;
	String name;
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
	
	@Override
	public String toString() {
		return "Laptop {id=" + id + ", name=" + name + "}";
	}
	public void name() {
		System.out.println("Therefore the Brand name is DELL & 2012 Model..");
	}
	 
}
