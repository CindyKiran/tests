package com.cindyk.test.designpatterns.mediator;

public interface Mediator {
	void setOccupied(boolean occupied);
	boolean canPractise();
	void sendToPractice(QuidditchTeam team);
	void sendBackToDorm(QuidditchTeam team);

}
