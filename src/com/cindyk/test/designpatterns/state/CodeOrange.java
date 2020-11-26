package com.cindyk.test.designpatterns.state;

//Concrete state
public class CodeOrange implements CodeWeather{
	@Override
	public void alert() {
		System.out.println("Hard storm upcoming; advised to stay at home");
	}
}
