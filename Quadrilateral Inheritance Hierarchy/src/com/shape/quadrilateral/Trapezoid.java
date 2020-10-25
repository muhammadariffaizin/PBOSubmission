package com.shape.quadrilateral;

import com.shape.Point;

public class Trapezoid extends Quadrilateral {

	public Trapezoid(double x1, double y1, double x2, double y2, 
			double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);		
	}
	
	public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
		super(point1, point2, point3, point4);
	}
	
	public double getHeight() {
		if(this.getNode1().getY() == this.getNode2().getY())
			return this.getYDistance(this.getNode2(), this.getNode3());
		else 
			return this.getYDistance(this.getNode1(), this.getNode2());
	}
	
	public double getTop() {
		if(this.getNode1().getY() == this.getNode2().getY())
			return this.getXDistance(this.getNode1(), this.getNode2());
		else 
			return this.getXDistance(this.getNode2(), this.getNode3());
	}
	
	public double getBottom() {
		if(this.getNode1().getY() == this.getNode2().getY())
			return this.getXDistance(this.getNode3(), this.getNode4());
		else 
			return this.getXDistance(this.getNode4(), this.getNode1());
	}
	
	public double getArea() {
		double top = this.getTop(); 
		double bottom = this.getBottom();
		double height = this.getHeight();
		return 0.5 * (top + bottom) * height;
	}
	
	@Override
	public String printAllProperties() {
		return String.format("%s\n%s:\n%s\n%s: %s\n%s: %s\n%s: %s\n%s: %s\n",
				"Trapezoid",
				"Coordinates", this.getPrintAllNodes(),
				"Top", this.getTop(),
				"Bottom", this.getBottom(),
				"Height", this.getHeight(),
				"Area", this.getArea());
	}
}
