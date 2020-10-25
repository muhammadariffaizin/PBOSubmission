package com.shape.quadrilateral;

import java.lang.Math;
import com.shape.Point;

public class Quadrilateral {
	private Point node_1;
	private Point node_2;
	private Point node_3;
	private Point node_4;

	public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
		this.setNode1(point1);
		this.setNode2(point2);
		this.setNode3(point3);
		this.setNode4(point4);
	}
	
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		this.setNode1(new Point(x1, y1));
		this.setNode2(new Point(x2, y2));
		this.setNode3(new Point(x3, y3));
		this.setNode4(new Point(x4, y4));		
	}
	
	public Point getNode1() {
		return this.node_1;
	}

	public void setNode1(Point node1) {
		this.node_1 = node1;
	}

	public Point getNode2() {
		return this.node_2;
	}

	public void setNode2(Point node2) {
		this.node_2 = node2;
	}

	public Point getNode3() {
		return this.node_3;
	}

	public void setNode3(Point node3) {
		this.node_3 = node3;
	}

	public Point getNode4() {
		return this.node_4;
	}

	public void setNode4(Point node4) {
		this.node_4 = node4;
	}
	
	public double getDistance(Point pointA, Point pointB) {
		double distanceX = pointA.getX() - pointB.getX();
		double distanceY = pointA.getY() - pointB.getY();
		
		return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
	}
	
	public double getXDistance(Point pointA, Point pointB) {
		return Math.abs(pointA.getX() - pointB.getX());
	}
	
	public double getYDistance(Point pointA, Point pointB) {
		return Math.abs(pointA.getY() - pointB.getY());
	}
	
	public String getPrintAllNodes() {
		return String.format("%s %s %s %s", this.getNode1(), this.getNode2(), this.getNode3(), this.getNode4());
	}
	
	public String printAllProperties() {
		return String.format("%s\n%s:\n%s\n", 
				"Quadrilateral", 
				"Coordinates", this.getPrintAllNodes());
	}
}
