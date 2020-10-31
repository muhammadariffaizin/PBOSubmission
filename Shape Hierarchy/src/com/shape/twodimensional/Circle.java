package com.shape.twodimensional;

public class Circle extends TwoDimensionalShape {
	private double radius;
	
	public Circle(int radius) {
		super();
		this.setRadius(radius);
		this.setName("Circle");
	}
	
	public Circle(double radius) {
		super();
		this.setRadius(radius);
		this.setName("Circle");
	}

	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return (22.0 / 7.0) * this.getRadius() * this.getRadius();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %s%n%s: %s%n", 
				"This is a " + this.getName(), 
				"Radius", this.getRadius(), 
				"Area", this.getArea());
	}
}
