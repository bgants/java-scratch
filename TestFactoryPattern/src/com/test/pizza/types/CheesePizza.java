package com.test.pizza.types;

import com.test.pizza.interfaces.PizzaIngrediantFactory;

public class CheesePizza extends Pizza {
	PizzaIngrediantFactory ingredientFactory;
	
	

	public CheesePizza(PizzaIngrediantFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}



	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing " +  name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();		
	}

}
