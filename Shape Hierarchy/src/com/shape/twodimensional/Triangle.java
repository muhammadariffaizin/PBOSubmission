package com.shape.twodimensional;

public class Triangle extends TwoDimensionalShape {
	private double base;
	private double height;
	
	public Triangle(int base, int height) {
		this.setBase(base);
		this.setHeight(height);
		this.setName("Triangle");
	}
	
	public Triangle(double base, double height){
		this.setBase(base);
		this.setHeight(height);
		this.setName("Triangle");
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea(){
		return 0.5 * this.getBase() * this.getHeight();
	}
	
	@Override 
	public String toString() {
		return String.format("%s%n%s: %s%n%s: %s%n%s: %s%n", 
				"This is a " + this.getName(), 
				"Base", this.getBase(), 
				"Height", this.getHeight(),
				"Area", this.getArea());
	}
}
