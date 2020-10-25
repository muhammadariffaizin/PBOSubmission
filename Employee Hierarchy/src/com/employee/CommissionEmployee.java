package com.employee;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.setGrossSales(grossSales);
		this.setCommissionRate(commissionRate);
	}

	public double getGrossSales() {
		return this.grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0"); 
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return this.commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}
	
	public double earnings() {
		return this.getCommissionRate() * this.getGrossSales();
	}
	
	@Override
	public String toString() {
		return String.format("%s%s: %.2f%n%s: %.2f%n",
				super.toString(),
				"gross sales", this.getGrossSales(), 
				"commission rate", this.getCommissionRate()); 
	}
}
