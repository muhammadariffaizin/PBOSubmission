package com.shape.threedimensional;

public class Tetrahedron extends ThreeDimensionalShape {
	private double edge;
	
	public Tetrahedron(int edge) {
		this.setEdge(edge);
		this.setName("Tetrahedron");	
	}
	public Tetrahedron(double edge) {
		this.setEdge(edge);
		this.setName("Tetrahedron");
	}

	public double getEdge() {
		return this.edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}
	
	@Override
	public double getArea() {
		return Math.sqrt(3) * this.getEdge() * this.getEdge();
	}
	
	@Override 
	public double getVolume() {
		return (Math.sqrt(2) / 12.0) * this.getEdge() * this.getEdge() * this.getEdge();
	}
	
	@Override
	public String toString() {
	return String.format("%s%n%s: %s%n%s: %s%n%s: %s%n", 
			"This is a " + this.getName(), 
			"Edge", this.getEdge(), 
			"Area", this.getArea(),
			"Volume", this.getVolume());
	}
}
