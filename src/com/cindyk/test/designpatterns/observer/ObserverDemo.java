package com.cindyk.test.designpatterns.observer;

public class ObserverDemo {
	public static void main(String[] args) {
		MinistryOfMagic ministryOfMagic = new MinistryOfMagic();
		ministryOfMagic.addObserver(new Owl());
		ministryOfMagic.addObserver(new DailyProphet());
		ministryOfMagic.addNews("Voldemort is back!");
		ministryOfMagic.addNews("Beware of Death Eaters");
		ministryOfMagic.spreadNews();
	}
}
