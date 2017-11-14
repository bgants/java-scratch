package com.gants.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="restaurants")
public class Restaurant {
	@Id
	private String id;
	
	
	private Address address;
	private String borough; 
	private String cuisine;

	
	private ArrayList<Grades> grades;
	private String name;
	private String restaurant_id;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getBorough() {
		return borough;
	}
	
	public void setBorough(String borough) {
		this.borough = borough;
	}
	
	public String getCuisine() {
		return cuisine;
	}
	
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
	public ArrayList<Grades> getGrades() {
		return grades;
	}
	
	public void setGrades(ArrayList<Grades> grades) {
		this.grades = grades;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRestaurant_id() {
		return restaurant_id;
	}
	
	public void setRestaurant_id(String restaurant_id) {
		this.restaurant_id = restaurant_id;
	}	
}
