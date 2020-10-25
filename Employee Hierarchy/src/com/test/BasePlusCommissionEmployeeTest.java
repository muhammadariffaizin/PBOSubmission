package com.test;

import com.employee.BasePlusCommissionEmployee;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", 
				"333-33-3333", 5000, .04, 300);
		BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("John", "Lewis", 
				"666-66-6666", 7000, .02, 289);

		System.out.println(employee);
		System.out.println(employee2);
	}

}
