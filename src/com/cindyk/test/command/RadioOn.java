package com.cindyk.test.command;

//concrete command classes
public class RadioOn implements MachineCommand {
	Radio radio;

	public RadioOn(Radio radio) {
		this.radio = radio;
	}

	@Override
	public void execute() {
		radio.on();
	}
}
