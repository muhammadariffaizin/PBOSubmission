package com.employee;

public class HourlyEmployee extends Employee {
	private double hours;
	private double wage;

	public HourlyEmployee(String firstName, String lastName,
			String socialSecurityNumber, double hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		this.setHours(hours);
		this.setWage(wage);
	}

	public double getHours() {
		return this.hours;
	}

	public void setHours(double hours) {
		if(hours < 0.0 || hours > 168.0)
			throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
		this.hours = hours;
	}

	public double getWage() {
		return this.wage;
	}

	public void setWage(double wage) {
		if(wage < 0.0)
			throw new IllegalArgumentException("Wage per hours must be >= 0.0");
		this.wage = wage;
	}
	
	public double earnings() {
		if(this.getHours() > 40)
			return 1.5 * this.getWage() * this.getHours();
		else 
			return this.getWage() * this.getHours();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%s: %.2f%n%s: %.2f%n%s: %.2f%n", 
				"hourly", super.toString(), 
				"work hours", this.getHours(), 
				"wage per hours", this.getWage(),
				"earnings", this.earnings());
	}
}
