package com.footprint.carbon;

public class Car extends CarbonFootprint {
	private double kilometresDrivenYearly;
	private double gallonsPerKilometre;
	
	public Car(double kilometresDriverYearly, double gallonsPerKilometre) {
		super();
		this.setKilometresDrivenYearly(kilometresDriverYearly);
		this.setGallonsPerKilometre(gallonsPerKilometre);
	}

	public double getKilometresDrivenYearly() {
		return kilometresDrivenYearly;
	}

	public void setKilometresDrivenYearly(double kilometresDrivenYearly) {
		this.kilometresDrivenYearly = kilometresDrivenYearly;
	}

	public double getGallonsPerKilometre() {
		return gallonsPerKilometre;
	}

	public void setGallonsPerKilometre(double gallonsPerKilometre) {
		this.gallonsPerKilometre = gallonsPerKilometre;
	}
	
	@Override
	public double getCarbonFootprint() {
		// source : https://www.masternaut.com/blog/how-to-calculate-your-fleets-carbon-footprint
		return this.getKilometresDrivenYearly() * this.getGallonsPerKilometre();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%s", "Car", 
				"For " + this.getKilometresDrivenYearly() + "km in a year, ", 
				"with " + this.getGallonsPerKilometre() + " gallons per km");
	}
}
