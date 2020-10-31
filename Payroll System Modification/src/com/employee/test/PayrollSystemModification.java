package com.employee.test;

import java.util.ArrayList;

import com.employee.*;

public class PayrollSystemModification {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("Bob", "Lewis", "333-33-3333"));
		employees.add(new CommissionEmployee("John", "Lewis", "333-33-3333", 5000, .04));
		employees.add(new BasePlusCommissionEmployee("Thomas", "Lewis", "333-33-3333", 5000, .04, 300));
		employees.add(new HourlyEmployee("Edward", "Lewis", "333-33-3333", 40, 20));
		employees.add(new PieceWorker("Paul", "Lewis", "333-33-3333", 6000, 30));
		
		for(Employee e: employees) {
			System.out.println(e);
		}
	}

}
