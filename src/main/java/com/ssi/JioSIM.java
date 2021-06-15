package com.ssi;

public class JioSIM implements SIM {
	
	
	private String mobileNumber;
	
	public void call() {
		System.out.println("Calling Using Jio SIM Number : "+mobileNumber);
	}

	public void sms() {
		System.out.println("Messaging Using Jio SIM Number : "+mobileNumber);
	}

	public void setMobileNumber(String number) {
		this.mobileNumber=number;
	}

}
