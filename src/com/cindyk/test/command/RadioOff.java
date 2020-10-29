package com.cindyk.test.command;

//concrete command classes
public class RadioOff implements MachineCommand {
	Radio radio;

	public RadioOff(Radio radio) {
		this.radio = radio;
	}

	@Override
	public void execute() {
		radio.off();
	}
}
