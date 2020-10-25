package com.shape.quadrilateral;

import com.shape.Point;

public class Rectangle extends Parallelogram {

	public Rectangle(double x1, double y1, double x2, double y2, double x3,
			double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public Rectangle(Point point1, Point point2, Point point3, Point point4) {
		super(point1, point2, point3, point4);
	}
	
	public String printAllProperties() {
		return String.format("%s\n%s:\n%s\n%s: %s\n%s: %s\n%s: %s\n",
				"Rectangle",
				"Coordinates of Rectangle", this.getPrintAllNodes(),
				"Width", this.getWidth(),
				"Height", this.getHeight(),
				"Area", this.getArea());
	}
}
