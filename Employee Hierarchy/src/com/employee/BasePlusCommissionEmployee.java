package com.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.setBaseSalary(baseSalary);
	}

	public double getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0"); 
		this.baseSalary = baseSalary;
	}

	public double earnings() {
		return this.getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%s: %.2f%n", "base-salaried", 
				super.toString(), "base salary", this.getBaseSalary());
	}
}
