package com.test;

import java.util.ArrayList;

import com.footprint.carbon.*;

public class CarbonFootprintTest {

	public static void main(String[] args) {
		ArrayList<CarbonFootprint> objects = new ArrayList<CarbonFootprint>();
		
		objects.add(new Building(200,300,100,200));
		objects.add(new Car(5000, 0.03));
		objects.add(new Bicycle(100, 16));
		
		for(CarbonFootprint object: objects) {
			System.out.println(object);
			System.out.println(String.format("%s: %s%n", 
					"The object will release", object.getCarbonFootprint() + "kg CO2 annually"));
		}
	}

}
