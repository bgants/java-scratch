package com.gants.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Person {
	@Id	
	private String id;
	private String name;
	private Date insertDate;
	
	public Person(){
		
	}
	
	
	public Person(String name, Date date) {
		this.name = name;
		this.insertDate = date;		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getInsertDate() {
		return insertDate;
	}


	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	
	@Override
	public String toString() {
		return id + ":: " + name+ "::" + insertDate;
	}
	
}
