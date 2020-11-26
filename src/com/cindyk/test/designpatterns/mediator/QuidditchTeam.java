package com.cindyk.test.designpatterns.mediator;

//Colleague
public abstract class QuidditchTeam {
	protected final Mediator mediator;

	public QuidditchTeam(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void goToPractise();
	public abstract void goBackToDorm();
}
