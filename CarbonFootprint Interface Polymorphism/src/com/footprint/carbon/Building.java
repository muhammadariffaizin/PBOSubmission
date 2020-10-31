package com.footprint.carbon;

public class Building extends CarbonFootprint {
	private double materialQuantity;
	private double embodiedCarbonPerMaterial;
	private double energyConsumptionDaily;
	private double daysUsage;
	
	public Building(double materialQuantity, double embodiedCarbonPerMaterial,
			double energyConsumptionDaily, double daysUsage) {
		super();
		this.setMaterialQuantity(materialQuantity);
		this.setEmbodiedCarbonPerMaterial(embodiedCarbonPerMaterial);
		this.setEnergyConsumptionDaily(energyConsumptionDaily);
		this.setDaysUsage(daysUsage);
	}

	public double getBuildingEmbodiedCarbon() {
		return this.getMaterialQuantity() * this.getEmbodiedCarbonPerMaterial();
	}
	
	public double getBuildingUsageCarbon() {
		return this.getEnergyConsumptionDaily() * this.getDaysUsage();
	}
	
	public double getMaterialQuantity() {
		return this.materialQuantity;
	}

	public void setMaterialQuantity(double materialQuantity) {
		this.materialQuantity = materialQuantity;
	}

	public double getEmbodiedCarbonPerMaterial() {
		return this.embodiedCarbonPerMaterial;
	}

	public void setEmbodiedCarbonPerMaterial(double embodiedCarbonPerMaterial) {
		this.embodiedCarbonPerMaterial = embodiedCarbonPerMaterial;
	}

	public double getEnergyConsumptionDaily() {
		return this.energyConsumptionDaily;
	}

	public void setEnergyConsumptionDaily(double energyConsumptionDaily) {
		this.energyConsumptionDaily = energyConsumptionDaily;
	}

	public double getDaysUsage() {
		return this.daysUsage;
	}

	public void setDaysUsage(double daysUsage) {
		this.daysUsage = daysUsage;
	}

	@Override
	public double getCarbonFootprint() {
		// source : https://www.ecohome.net/guides/3477/calculating-the-carbon-footprint-of-buildings-introducing-the-ec3-calculator-from-skanska/
		return this.getBuildingEmbodiedCarbon() + this.getBuildingUsageCarbon();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%s", "Building", 
				"With " + this.getBuildingEmbodiedCarbon() + "kg CO2 for embodied building, ", 
				"and " + this.getBuildingUsageCarbon() + "kg CO2 for usage building.");
	}
}
