package com.test.pizza.types;

import com.test.pizza.ingedients.Cheese;
import com.test.pizza.ingedients.Dough;
import com.test.pizza.ingedients.Pepperoni;
import com.test.pizza.ingedients.Sauce;
import com.test.pizza.ingedients.Veggies;

public abstract class Pizza {
	String name;
	
	
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	
	abstract void prepare();					

	
	public void bake() {
		System.out.println("Baking ...... 25 minutes @ 350 .....");
		
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices...");
	}
	
	public void box() {
		System.out.println("Placing the pizza into official box...");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
