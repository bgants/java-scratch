package com.test.decorator;

import com.test.component.Beverage;

public abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();
}
