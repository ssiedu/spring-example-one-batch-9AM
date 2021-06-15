package com.ssi;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Info {
	private String companyName;
	private String companyAddress;
	private List<String> emails;
	private Set<String> mobiles;
	private Map<String,String> management;
	
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
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
	public Set<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}
	public Map<String, String> getManagement() {
		return management;
	}
	public void setManagement(Map<String, String> management) {
		this.management = management;
	}
	@Override
	public String toString() {
		return "Info [companyName=" + companyName + ", companyAddress=" + companyAddress + ", emails=" + emails
				+ ", mobiles=" + mobiles + ", management=" + management + "]";
	}
	

	
}
