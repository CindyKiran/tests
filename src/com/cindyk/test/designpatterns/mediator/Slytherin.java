package com.cindyk.test.designpatterns.mediator;

//Concrete Colleague
public class Slytherin extends QuidditchTeam {

	public Slytherin(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void goToPractise(){
		if(mediator.canPractise()){
			System.out.println("Slytherin team impatiently waiting for other team to leave the arena");
		} else {
			System.out.println("Slytherin team now occupying the arena");
			mediator.setOccupied(true);
		}
	}

	@Override
	public void goBackToDorm() {
		System.out.println("Slytherin team leaves arena");
		mediator.setOccupied(false);
	}
}
