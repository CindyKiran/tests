package com.cindyk.test.chainofresponsibility;

public class CORDemo {
	public static void main(String[] args) {
		Headmaster dumbledore = new Headmaster();
		Housemaster mcgonagall = new Housemaster();
		Teacher hagrid = new Teacher();

		dumbledore.setSuccessor(mcgonagall);
		mcgonagall.setSuccessor(hagrid);

		Duty teaching = new Duty(Authorization.STAFF);
		Duty security = new Duty(Authorization.HEADMINISTER);
		Duty administration = new Duty(Authorization.HEADMASTER);

		mcgonagall.setAttendance(true);
		dumbledore.setAttendance(false);

		//because dumbledore is not home, the one handling his duty is mcgonagall
		dumbledore.handleHogwartsDuty(administration); //not allowed
		dumbledore.handleHogwartsDuty(security); //allowed
		mcgonagall.setAttendance(false);

		//because mcgonagall is not home anymore, the one handling her duty is hagrid
		mcgonagall.handleHogwartsDuty(teaching); //allowed
		mcgonagall.handleHogwartsDuty(security); //not allowed
	}

}
