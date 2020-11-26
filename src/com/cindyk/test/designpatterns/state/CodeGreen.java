package com.cindyk.test.designpatterns.state;

public class CodeGreen implements CodeWeather{
	@Override
	public void alert() {
		System.out.println("Weather is good. No need to alert the citizen");
	}
}
