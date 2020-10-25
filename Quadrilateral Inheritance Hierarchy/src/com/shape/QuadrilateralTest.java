package com.shape;

import com.shape.Point;

import com.shape.quadrilateral.Quadrilateral;
import com.shape.quadrilateral.Trapezoid;
import com.shape.quadrilateral.Parallelogram;
import com.shape.quadrilateral.Rectangle;
import com.shape.quadrilateral.Square;

public class QuadrilateralTest {
	public static void main(String[] args) {
		Quadrilateral shapeQuadrilateral = new Quadrilateral(new Point(1.1, 1.2), new Point(6.6, 2.8), new Point(6.2, 9.9), new Point(2.2, 7.4));
		Quadrilateral shapeTrapezoid = new Trapezoid(0, 2, 3, 7, 7, 7, 8, 2);
		Quadrilateral shapeParallelogram = new Parallelogram(5, 5, 11, 5, 12, 20, 6, 20);
		Quadrilateral shapeRectangle = new Rectangle(17, 14, 30, 14, 30, 28, 17, 28);
		Quadrilateral shapeSquare = new Square(4, 0, 8, 0, 8, 4, 4, 4);
		Quadrilateral shapeAnonymous = new Quadrilateral(1000, 2123, 3234, 4345, 5456, 6567, 7678, 8789);
		
		System.out.println(shapeQuadrilateral.printAllProperties());
		System.out.println(shapeTrapezoid.printAllProperties());
		System.out.println(shapeParallelogram.printAllProperties());
		System.out.println(shapeRectangle.printAllProperties());
		System.out.println(shapeSquare.printAllProperties());
		System.out.println(shapeAnonymous.printAllProperties());

	}
}
