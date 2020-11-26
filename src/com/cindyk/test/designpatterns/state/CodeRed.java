package com.cindyk.test.designpatterns.state;

//Concrete state
public class CodeRed implements CodeWeather {
	@Override
	public void alert() {
		System.out.println("Tornado upcoming, mandatory to stay at home");
	}
}
