package com.test;

import com.test.interfaces.FlyBehavior;
import com.test.interfaces.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;	
	QuackBehavior quackBehavior;
	
	private void preformFly() {
		flyBehavior.fly();
	}
		
	private void preformQuack() {
		quackBehavior.quack();
	}
}
