package com.cindyk.test.designpatterns.memento;

import java.time.LocalTime;

public class Memento {
	private final String place;
	private final LocalTime time;
	private final String description;

	public Memento(String place, LocalTime time, String description) {
		this.place = place;
		this.time = time;
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public LocalTime getTime() {
		return time;
	}

	public String getDescription() {
		return description;
	}
}
