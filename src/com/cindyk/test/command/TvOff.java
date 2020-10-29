package com.cindyk.test.command;

//concrete command classes
public class TvOff implements MachineCommand {
	Tv tv;

	public TvOff(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}
}
