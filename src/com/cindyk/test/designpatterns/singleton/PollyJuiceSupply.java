package com.cindyk.test.designpatterns.singleton;

public class PollyJuiceSupply {
	private int storage;

	private PollyJuiceSupply(){
		//prevent other instances of this object
	}

	private static final PollyJuiceSupply instance = new PollyJuiceSupply();

	public static PollyJuiceSupply getInstance(){
		return instance;
	}

	//must be synchronized to prevent multi-threaded requests at same time
	public synchronized void addSupply(int amount){
		storage += amount;
	}

	public synchronized void removeSupply(int amount){
		if(amount > storage){
			storage = 0;
			System.out.println("Requested more than available. Give " + amount + "instead.");
		}

		storage -= amount;
	}

	public synchronized int getStorage(){
		return storage;
	}
}
