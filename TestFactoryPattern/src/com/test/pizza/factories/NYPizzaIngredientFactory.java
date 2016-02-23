package com.test.pizza.factories;

import com.test.pizza.ingedients.Cheese;
import com.test.pizza.ingedients.Dough;
import com.test.pizza.ingedients.Pepperoni;
import com.test.pizza.ingedients.Sauce;
import com.test.pizza.ingedients.Veggies;
import com.test.pizza.ingedients.concrete.Garlic;
import com.test.pizza.ingedients.concrete.MarinaraSauce;
import com.test.pizza.ingedients.concrete.Mushroom;
import com.test.pizza.ingedients.concrete.Onion;
import com.test.pizza.ingedients.concrete.RedPepper;
import com.test.pizza.ingedients.concrete.ReggianoCheese;
import com.test.pizza.ingedients.concrete.SlicedPepperoni;
import com.test.pizza.ingedients.concrete.ThinCrustDough;
import com.test.pizza.interfaces.PizzaIngrediantFactory;

public class NYPizzaIngredientFactory implements PizzaIngrediantFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

}
