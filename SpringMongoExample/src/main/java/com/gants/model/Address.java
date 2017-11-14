package com.gants.model;

import java.util.ArrayList;

public class Address {
	private String building;
	private String street;
	private String zipcode;
	private ArrayList<Double>  coord;
	
	
	
	public Address(String building, String street, String zipcode, ArrayList<Double> coord) {
		super();
		this.building = building;
		this.street = street;
		this.zipcode = zipcode;
		this.coord = coord;
	}

	public String getBuilding() {
		return building;
	}
	
	public void setBuilding(String building) {
		this.building = building;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public ArrayList<Double> getCoord() {
		return coord;
	}
	
	public void setCoord(ArrayList<Double> coord) {
		this.coord = coord;
	}
	
}
