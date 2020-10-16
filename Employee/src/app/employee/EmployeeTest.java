package app.employee;

import app.employee.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee user_1 = new Employee("Abdur", "Rohman", 400000);
		Employee user_2 = new Employee("Abdul", "Hadi", 500000);
		System.out.println("Yearly salary for " + user_1.getFirstName() + " " + user_1.getLastName() + " is");
		System.out.println(user_1.getYearSalary());
		System.out.println("And then after adding raise, the yearly salary was");
		System.out.println(user_1.getYearSalaryWithRaise());
		System.out.println("Yearly salary for " + user_2.getFirstName() + " " + user_2.getLastName() + " is");
		System.out.println(user_2.getYearSalary());
		System.out.println("And then after adding raise, the yearly salary was");
		System.out.println(user_2.getYearSalaryWithRaise());
	}
}
