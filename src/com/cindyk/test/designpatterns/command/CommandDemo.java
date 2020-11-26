package com.cindyk.test.designpatterns.command;

public class CommandDemo {
	public static void main(String[] args) {
		UniversalRemoteController remote = new UniversalRemoteController();
		Tv tv = new Tv();
		Radio radio = new Radio();
		remote.setMachine(new RadioOn(radio));
		remote.click();
		remote.setMachine(new RadioOff(radio));
		remote.click();

		remote.setMachine(new TvOn(tv));
		remote.click();
		remote.setMachine(new TvOff(tv));
		remote.click();
	}

}
