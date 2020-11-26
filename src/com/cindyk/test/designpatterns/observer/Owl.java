package com.cindyk.test.designpatterns.observer;

import java.util.List;

//Concrete observer
public class Owl implements Media{
	@Override
	public void update(List<String> message) {
		System.out.println("Letter subject: " + message);
	}
}
