package com.cindyk.test.designpatterns.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		PollyJuiceSupply pollyJuiceSupply = PollyJuiceSupply.getInstance();
		pollyJuiceSupply.addSupply(50);
		System.out.println(pollyJuiceSupply.getStorage()); //50

		//create new object
		PollyJuiceSupply pollyJuiceSupply2 = PollyJuiceSupply.getInstance();
		//not added anything
		System.out.println(pollyJuiceSupply2.getStorage()); //50

		pollyJuiceSupply2.removeSupply(10);
		System.out.println(pollyJuiceSupply2.getStorage()); //40
		System.out.println(pollyJuiceSupply.getStorage()); //40

	}

}
