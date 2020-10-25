package com.employee;

public class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSocialSecurityNumber(socialSecurityNumber);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}
	
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n", 
				"commission employee", this.getFirstName(), this.getLastName(), 
				"social security number", this.getSocialSecurityNumber());
	}
}
