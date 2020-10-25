package com.test;

import com.employee.HourlyEmployee;

public class HourlyEmployeeTest {

	public static void main(String[] args) {
		HourlyEmployee employee = new HourlyEmployee("Bob", "Lewis", "333-33-3333", 40, 20);
		HourlyEmployee employee2 = new HourlyEmployee("John", "Lewis", "666-66-6666", 50, 20);
		
		System.out.println(employee);
		System.out.println(employee2);
	}

}
