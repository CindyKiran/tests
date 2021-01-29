package com.cindyk.test.designpatterns.visitor;

public class ApplePie implements Sweets{
	double price = 3.5;

	//5.Must override this method and provide implementation
	@Override
	public double getPrice() {
		return price;
	}
}
