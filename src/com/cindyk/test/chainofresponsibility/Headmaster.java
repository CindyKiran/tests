package com.cindyk.test.chainofresponsibility;

public class Headmaster extends Handler {
	private boolean attendance;

	@Override
	public void handleHogwartsDuty(Duty duty) {
		if(attendance) {
			switch (duty.getAuthorization()) {
				case HEADMASTER:
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
