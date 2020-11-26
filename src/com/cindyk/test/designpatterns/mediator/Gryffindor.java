package com.cindyk.test.designpatterns.mediator;

//Concrete Colleague
public class Gryffindor extends QuidditchTeam {
	public Gryffindor(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void goToPractise(){
		if(mediator.canPractise()){
			System.out.println("Gryffindor team waiting for other team to leave the arena");
		} else {
			System.out.println("Gryffindor team now occupying the arena");
			mediator.setOccupied(true);
		}
	}

	@Override
	public void goBackToDorm() {
		System.out.println("Gryffindor team leaves arena");
		mediator.setOccupied(false);
	}
}
