package com.cindyk.test.designpatterns.mediator;

public class MediatorImpl implements Mediator {
	protected boolean arenaOccupied;

	@Override
	public void sendBackToDorm(QuidditchTeam team) {
		team.goBackToDorm();
	}

	@Override
	public void sendToPractice(QuidditchTeam team) {
		team.goToPractise();
	}

	@Override
	public void setOccupied(boolean occupied) {
		arenaOccupied = occupied;
	}

	@Override
	public boolean canPractise() {
		return arenaOccupied;
	}
}
