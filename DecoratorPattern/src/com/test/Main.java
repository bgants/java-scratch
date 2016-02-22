package com.test;

import com.test.component.Beverage;
import com.test.component.Espresso;
import com.test.component.HouseBlend;
import com.test.decorator.Mocha;

public class Main {

	public static void main(String[] args) {
		Beverage beverage1 = new Espresso();		
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());		
	}

}
