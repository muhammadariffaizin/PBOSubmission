package com.shape.threedimensional;

public class Sphere extends ThreeDimensionalShape {
	private double radius;
	
	public Sphere(int radius) {
		this.setRadius(radius);
		this.setName("Sphere");
	}
	
	public Sphere(double radius){
		this.setRadius(radius);
		this.setName("Sphere");
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return 4 * (22.0 / 7.0) * this.getRadius() * this.getRadius();
	}
	
	@Override
	public double getVolume() {
		return (4.0 / 3.0) * (22.0 / 7.0) * this.getRadius() * this.getRadius() * this.getRadius();
	}
	
	@Override 
	public String toString() {
		return String.format("%s%n%s: %s%n%s: %s%n%s: %s%n", 
				"This is a " + this.getName(), 
				"Radius", this.getRadius(), 
				"Area", this.getArea(),
				"Volume", this.getVolume());
	}
}
