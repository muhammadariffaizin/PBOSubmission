package com.shape.threedimensional;

public class Cube extends ThreeDimensionalShape {
	private double side;
	
	public Cube(int side) {
		this.setSide(side);
		this.setName("Cube");
	}
	
	public Cube(double side) {
		this.setSide(side);
		this.setName("Cube");
	}

	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return 6 * this.getSide() * this.getSide();
	}
	
	@Override
	public double getVolume() {
		return this.getSide() * this.getSide() * this.getSide();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %s%n%s: %s%n%s: %s%n", 
				"This is a " + this.getName(), 
				"Side", this.getSide(), 
				"Area", this.getArea(),
				"Volume", this.getVolume());
	}
}
