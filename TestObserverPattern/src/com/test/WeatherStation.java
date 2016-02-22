package com.test;


import com.test.implementations.CurrentConditionDisplay;
import com.test.implementations.Weather;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weather weatherData = new Weather();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurments(99, 100, 45);
		weatherData.setMeasurments(98, 100, 55);
		weatherData.setMeasurments(99, 97, 45);
		weatherData.setMeasurments(97, 100, 65);
		weatherData.setMeasurments(99, 96, 55);
		weatherData.setMeasurments(96, 98, 45);
		weatherData.setMeasurments(99, 98, 55);

	}

}
