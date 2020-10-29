package com.cindyk.test.chainofresponsibility;

public class Teacher extends Handler {
	@Override
	public void handleHogwartsDuty(Duty duty) {
		switch (duty.getAuthorization()) {
			case HEADMINISTER:
			case HEADMASTER:
			case STAFF:
				System.out.println(this.getClass().getSimpleName() + " allowed");
		}

	}
}
