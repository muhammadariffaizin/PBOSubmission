package com.shape;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Point {
	private double x;
	private double y;
	
	public Point(int x, int y) {
		this.setX(new Double(x));
		this.setY(new Double(y));
	}
	
	public Point(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String commaToDot(double number) {
		DecimalFormatSymbols symbol = DecimalFormatSymbols.getInstance();
		symbol.setDecimalSeparator('.');
		symbol.setGroupingSeparator(' ');
		DecimalFormat df = new DecimalFormat("###,###.#", symbol);
		return df.format(number);
	}
	
	public String toString() {
		return String.format("(%s, %s)", commaToDot(this.getX()), commaToDot(this.getY()));
	}
}
