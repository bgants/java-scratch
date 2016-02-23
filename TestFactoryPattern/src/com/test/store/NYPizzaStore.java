package com.test.store;

import com.test.pizza.factories.NYPizzaIngredientFactory;
import com.test.pizza.interfaces.PizzaIngrediantFactory;
import com.test.pizza.types.CheesePizza;
import com.test.pizza.types.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngrediantFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("chesse")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}
		
		return pizza;
	}

}
