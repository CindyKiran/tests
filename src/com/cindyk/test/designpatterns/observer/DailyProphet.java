package com.cindyk.test.designpatterns.observer;

import java.util.List;

//Concrete observer
public class DailyProphet implements Media{
	@Override
	public void update(List<String> message) {
		System.out.println("DailyProhpet Headlines: " + message);
	}
}
