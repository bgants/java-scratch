package com.test.pizza.interfaces;

import com.test.pizza.ingedients.Cheese;
import com.test.pizza.ingedients.Dough;
import com.test.pizza.ingedients.Pepperoni;
import com.test.pizza.ingedients.Sauce;
import com.test.pizza.ingedients.Veggies;

public interface PizzaIngrediantFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
}
