package com.techelevator;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
	}
	
	public String getFullName() {
		return lastName + ", "+ firstName;
	}
	
	
	// raiseSalary(double percent)` increases the current annual salary by the percentage provided
	public void raiseSalary(double percent) {

		annualSalary  *=(1+ (percent/100));
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}
	
	

}
