package com.test;

import com.test.store.NYPizzaStore;
import com.test.store.PizzaStore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PizzaStore nyStore = new NYPizzaStore();
		nyStore.orderPizza("chesse");
		
	}

}
