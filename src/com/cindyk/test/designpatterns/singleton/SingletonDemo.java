package com.cindyk.test.designpatterns.singleton;

/**
 * Two different stores, having shared same pollyJuice storage
 * Updating the pollyjuice quantity on one instance, will also affect the quantity of the other instance
 */
public class SingletonDemo {
	public static void main(String[] args) {
		StoreFred storeFred = new StoreFred();
		StoreGeorge storeGeorge = new StoreGeorge();

		storeFred.getPollyJuiceSupply().addSupply(50);
		storeGeorge.getPollyJuiceSupply().removeSupply(10);

		System.out.println(storeFred.getPollyJuiceSupply().getStorage()); //40
		System.out.println(storeGeorge.getPollyJuiceSupply().getStorage()); //also 40
	}

}


class StoreFred{
	private final PollyJuiceSupply pollyJuiceSupply = PollyJuiceSupply.getInstance();

	public PollyJuiceSupply getPollyJuiceSupply() {
		return pollyJuiceSupply;
	}
}

class StoreGeorge{
	private final PollyJuiceSupply pollyJuiceSupply = PollyJuiceSupply.getInstance();

	public PollyJuiceSupply getPollyJuiceSupply() {
		return pollyJuiceSupply;
	}
}
