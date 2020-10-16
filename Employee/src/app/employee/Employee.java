package app.employee;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthSalary;
	
	public Employee(String modelFirstName, String modelLastName, double modelMonthSalary) {
		if(modelMonthSalary > 0) {
			this.setFirstName(modelFirstName);
			this.setLastName(modelLastName);
			this.setMonthSalary(modelMonthSalary);				
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last_name) {
		this.lastName = last_name;
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(double month_salary) {
		this.monthSalary = month_salary;
	}
	
	public double getYearSalary() {
		return this.getMonthSalary() * 12;
	}
	
	public double getYearSalaryWithRaise() {
		double raise = this.getMonthSalary()*12/10;
		return this.getMonthSalary() * 12 + raise;
	}
}
