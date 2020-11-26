package com.cindyk.test.designpatterns.chainofresponsibility;

public abstract class Handler {
	Handler successor;

	public void setSuccessor(Handler successor){
		this.successor = successor;
	}

	public abstract void handleHogwartsDuty(Duty duty);

}
