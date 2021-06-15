package com.ssi;

public class AirtelSIM implements SIM {

	private String mobileNumber;
	
	
	
	public void call() {
		System.out.println("Calling Using Airtel SIM Number " +mobileNumber);

	}

	public void sms() {
		System.out.println("Messaging Using Airtel SIM Number " +mobileNumber);

	}

	public void setMobileNumber(String number) {
		this.mobileNumber=number;
	}

}
