package com.cindyk.test;

import com.cindyk.test.command.Radio;
import com.cindyk.test.command.RadioOff;
import com.cindyk.test.command.RadioOn;
import com.cindyk.test.command.Tv;
import com.cindyk.test.command.TvOff;
import com.cindyk.test.command.TvOn;
import com.cindyk.test.command.UniversalRemoteController;

import java.util.List;

public class Test {

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

	private static void printOut(List list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}

}
