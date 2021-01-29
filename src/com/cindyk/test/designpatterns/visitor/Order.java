package com.cindyk.test.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Order {
	public List<Sweets> orderedSweets = new ArrayList<>();

	//2.Create method to calculate price
	public double calculatePrice(){
		return orderedSweets.stream()
				.mapToDouble(Sweets::getPrice)
				.sum();
	}
}
