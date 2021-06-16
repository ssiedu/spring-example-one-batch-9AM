package com.ssi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Info {
	private String companyName;
	private List<Address> companyAddresses;
	private List<String> emails;
	private Set<String> mobiles;
	private Map<String,String> management;
	private Properties branches;
	
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
	public List<Address> getCompanyAddresses() {
		return companyAddresses;
	}
	public void setCompanyAddresses(List<Address> companyAddresses) {
		this.companyAddresses = companyAddresses;
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
	
	public Properties getBranches() {
		return branches;
	}
	public void setBranches(Properties branches) {
		this.branches = branches;
	}
	@Override
	public String toString() {
		return "Info [companyName=" + companyName + ", companyAddresses=" + companyAddresses + ", emails=" + emails
				+ ", mobiles=" + mobiles + ", management=" + management + ", branches=" + branches + "]";
	}

	

	
}
