package com.footprint.carbon;

public class Bicycle extends CarbonFootprint {
	private double kilometresDrivenYearly;
	private double caloriesPerKilometre;

	public Bicycle(double kilometresDrivenYearly, double caloriesPerKilometre) {
		super();
		this.setKilometresDrivenYearly(kilometresDrivenYearly);
		this.setCaloriesPerKilometre(caloriesPerKilometre);
	}
	
	public double getKilometresDrivenYearly() {
		return this.kilometresDrivenYearly;
	}

	public void setKilometresDrivenYearly(double kilometresDrivenYearly) {
		this.kilometresDrivenYearly = kilometresDrivenYearly;
	}

	public double getCaloriesPerKilometre() {
		return this.caloriesPerKilometre;
	}

	public void setCaloriesPerKilometre(double caloriesPerKilometre) {
		this.caloriesPerKilometre = caloriesPerKilometre;
	}
	
	@Override
	public double getCarbonFootprint() {
		// source : https://co2living.com/reduce-carbon-footprint-by-cycling/
		return this.getKilometresDrivenYearly() * this.getCaloriesPerKilometre();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%s", "Bicycle", 
				"For " + this.getKilometresDrivenYearly() + "km in a year, ", 
				"with " + this.getCaloriesPerKilometre() + " calories per km");
	}
}
