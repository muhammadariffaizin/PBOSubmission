package com.shape.quadrilateral;

import com.shape.Point;

public class Square extends Rectangle {
	public Square(double x1, double y1, double x2, double y2, double x3,
			double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public Square(Point point1, Point point2, Point point3, Point point4) {
		super(point1, point2, point3, point4);
	}
	
	@Override
	public String printAllProperties() {
		return String.format("%s\n%s:\n%s\n%s: %s\n%s: %s\n",
				"Square",
				"Coordinates of Square", this.getPrintAllNodes(),
				"Side", this.getWidth(),
				"Area", this.getArea());
	}
}
