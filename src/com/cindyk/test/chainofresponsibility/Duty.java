package com.cindyk.test.chainofresponsibility;

public class Duty {
	private Authorization authorization;

	public Duty(Authorization authorization){
		this.authorization = authorization;
	}

	public Authorization getAuthorization() {
		return authorization;
	}
}
