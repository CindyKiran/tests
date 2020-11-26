package com.cindyk.test.harrypotter;

public class Student {
	private String firstName;
	private String lastName;
	private HouseDivision house;
	private int year;
	private int points;

	public Student(String firstName, String lastName, HouseDivision house) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.house = house;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public HouseDivision getHouse() {
		return house;
	}

	public void setHouse(HouseDivision house) {
		this.house = house;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return String.format("%s %s from %s", firstName, lastName, house.name());
	}
}
