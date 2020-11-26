package com.cindyk.test.designpatterns.memento;

import java.time.LocalTime;

public class MementoDemo {
	public static void main(String[] args) {
		TimeTurner timeTurner = new TimeTurner();

		Situation afterSiriusCaptured = new Situation(
				"Hospital",
				LocalTime.parse("23:59"),
				"Sitting in hospital with Hermoine and Ron with broken leg");

		Situation beforeSiriusCaptured = new Situation(
				"Hospital",
				LocalTime.parse("07:30"),
				"Standing in hospital with Hermoine");

		timeTurner.save(beforeSiriusCaptured);
		printOut(timeTurner);

		System.out.println("-----------------------");

		timeTurner.save(afterSiriusCaptured);
		printOut(timeTurner);

		System.out.println("-----------------------");
		timeTurner.goBack(afterSiriusCaptured);
		printOut(timeTurner);
	}

	private static void printOut(TimeTurner timeTurner) {
		timeTurner.getCheckPoints().forEach(checkpoint -> {
			System.out.println(checkpoint.getDescription());
			System.out.println(checkpoint.getTime());
		});
	}
}
