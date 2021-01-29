package com.cindyk.test.designpatterns.visitor;

public class VisiterDemo {
	public static void main(String[] args) {
		Order order = new Order();
		order.orderedSweets.add(new Chocolate());
		order.orderedSweets.add(new Cupcake());
		order.orderedSweets.add(new ApplePie());

		//1.when add this new method
		System.out.println(order.calculatePrice());
	}
}
