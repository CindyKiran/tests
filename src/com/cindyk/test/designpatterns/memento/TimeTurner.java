package com.cindyk.test.designpatterns.memento;

import java.util.Stack;

//Caretaker
public class TimeTurner {

	//Part of Collection which is easy to get last element of list
	private Stack<Memento> checkPoints = new Stack<>();

	public void save(Situation situation){
		Memento currentMoment = situation.createCheckPoint();
		checkPoints.push(currentMoment);
	}

	public void goBack(Situation situation){
		situation.goToCheckPoint(checkPoints.pop());
	}

	public Stack<Memento> getCheckPoints() {
		return checkPoints;
	}
}
