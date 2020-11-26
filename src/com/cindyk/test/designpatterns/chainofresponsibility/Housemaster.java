package com.cindyk.test.designpatterns.chainofresponsibility;

public class Housemaster extends Handler {
	private boolean attendance;

	@Override
	public void handleHogwartsDuty(Duty duty) {
		if (attendance) {
			switch (duty.getAuthorization()) {
				case HEADMASTER:
					System.out.println(this.getClass().getSimpleName() + " not allowed");
					break;
				case HEADMINISTER:
				case STAFF:
					System.out.println(this.getClass().getSimpleName() + " allowed");
			}
		} else {
			successor.handleHogwartsDuty(duty);
		}
	}

	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}
}
