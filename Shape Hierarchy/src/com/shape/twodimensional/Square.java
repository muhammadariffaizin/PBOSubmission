package com.shape.twodimensional;

public class Square extends TwoDimensionalShape {
	private double side;
	
	public Square(int side) {
		super();
		this.setSide(side);
		this.setName("Square");
	}
	
	public Square(double side) {
		super();
		this.setSide(side);
		this.setName("Square");
	}

	public double getSide() {
		return this.side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return this.getSide() * this.getSide();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %s%n%s: %s%n", 
				"This is a " + this.getName(), 
				"Side", this.getSide(), 
				"Area", this.getArea());
	}
}
