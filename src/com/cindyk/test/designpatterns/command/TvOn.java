package com.cindyk.test.designpatterns.command;

//concrete command classes
public class TvOn implements MachineCommand {
	Tv tv;

	public TvOn(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}
}
