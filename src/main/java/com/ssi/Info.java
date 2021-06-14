package com.ssi;

public class Info {
	private String companyName;
	private String companyAddress;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	@Override
	public String toString() {
		return "Info [companyName=" + companyName + ", companyAddress=" + companyAddress + "]";
	}
	
	
}
