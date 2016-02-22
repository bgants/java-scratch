package com.test.component;

import com.test.component.Beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "Housde Blend Coffee";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}

}
