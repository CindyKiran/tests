package com.cindyk.test.designpatterns.memento;

import java.time.LocalTime;

//Originator
public class Situation {
	private String place;
	private LocalTime time;
	private String description;

	public Situation(String place, LocalTime time, String description) {
		this.place = place;
		this.time = time;
		this.description = description;
	}

	public Memento createCheckPoint(){
		return new Memento(place, time, description);
	}

	public void goToCheckPoint(Memento checkpoint){
		this.place = checkpoint.getPlace();
		this.description = checkpoint.getDescription();
		this.time = checkpoint.getTime();
	}
}
