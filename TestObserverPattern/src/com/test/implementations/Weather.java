package com.test.implementations;

import java.util.ArrayList;

import com.test.interfaces.Observer;
import com.test.interfaces.Subject;

public class Weather implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public Weather() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if( i > 0) {
			observers.remove(i);
		}

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update(this.temperature, this.humidity, this.pressure);
		}

	}
		
	public void measurementChanged() {
		notifyObservers();
	}

	public void setMeasurments(float temperature, float humidity, float pressure) {
		this.pressure = pressure;
		this.temperature = temperature;
		this.humidity = humidity;
		measurementChanged();
	}
	
	

}
