package com.test;

import com.test.implementations.FlyWithWings;
import com.test.implementations.Quack;

public class MallardDuck extends Duck{
	
	MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I am a real Mallard");
		quackBehavior.quack();
		flyBehavior.fly();		
	}

}
