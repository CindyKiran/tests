package com.cindyk.test.designpatterns.visitor;

public class Cupcake implements Sweets{
	private double price = 4;

	//4.Must override this method and provide implementation
	@Override
	public double getPrice() {
		return price;
	}
}
