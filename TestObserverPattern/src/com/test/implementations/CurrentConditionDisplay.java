package com.test.implementations;

import com.test.interfaces.DisplayElement;
import com.test.interfaces.Observer;
import com.test.interfaces.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();

	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions are : ");
		System.out.println("Temp : " + this.temperature);
		System.out.println("Humidity : " + this.humidity);
		System.out.println("Pressure : " + this.pressure);
		System.out.println();		
	}

}
