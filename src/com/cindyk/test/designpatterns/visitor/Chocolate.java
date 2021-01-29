package com.cindyk.test.designpatterns.visitor;

public class Chocolate implements Sweets{
	double price = 2.75;

	//6.Must override this method and provide implementation
	@Override
	public double getPrice() {
		return price;
	}
}
