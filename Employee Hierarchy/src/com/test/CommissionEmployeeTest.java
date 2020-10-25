package com.test;

import com.employee.CommissionEmployee;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		 CommissionEmployee employee = new CommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04);
		 CommissionEmployee employee2 = new CommissionEmployee("John", "Lewis", "666-66-6666", 7000, .02);
		 
		 System.out.println(employee);
		 System.out.println(employee2);
	}

}
