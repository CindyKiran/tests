package com.cindyk.test.designpatterns.chainofresponsibility;

public class Duty {
	private Authorization authorization;

	public Duty(Authorization authorization){
		this.authorization = authorization;
	}

	public Authorization getAuthorization() {
		return authorization;
	}
}
