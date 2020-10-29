package com.cindyk.test.command;

//https://www.geeksforgeeks.org/command-pattern/
//invoker
public class UniversalRemoteController {
	MachineCommand machine;

	public void setMachine(MachineCommand machine){
		this.machine = machine;
	}

	public void click(){
		machine.execute();
	}
}
