package com.main;

import com.shape.*;
import com.shape.twodimensional.*;
import com.shape.threedimensional.*;
import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Circle(7));
		shapes.add(new Square(10));
		shapes.add(new Triangle(7, 10));
		shapes.add(new Cube(10));
		shapes.add(new Sphere(7));
		shapes.add(new Tetrahedron(7));
		
		for(Shape s: shapes) {
			System.out.println(String.format("%s %s", "This is a", s.getName()));
			if(s instanceof TwoDimensionalShape) {
				System.out.println(String.format("%s: %s%n", 
						"Area", ((TwoDimensionalShape) s).getArea()));
			} else if(s instanceof ThreeDimensionalShape) {
				System.out.println(String.format("%s: %s%n%s: %s%n", 
						"Area", ((ThreeDimensionalShape) s).getArea(), 
						"Volume", ((ThreeDimensionalShape) s).getVolume()));
			}
		}
	}

}
