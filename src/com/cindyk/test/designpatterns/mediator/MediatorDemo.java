package com.cindyk.test.designpatterns.mediator;

public class MediatorDemo {
	public static void main(String[] args) {
		Mediator mediator = new MediatorImpl();

		QuidditchTeam gryffindor = new Gryffindor(mediator);
		QuidditchTeam slytherin = new Slytherin(mediator);

		System.out.println("Arena is occupied? :" + mediator.canPractise());
		mediator.sendToPractice(gryffindor);
		mediator.sendToPractice(slytherin);
		mediator.sendBackToDorm(gryffindor);
		mediator.sendToPractice(slytherin);
		System.out.println("Arena is occupied? :" + mediator.canPractise());
	}

}
