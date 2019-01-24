package com.techelevator.company;

public class Company {

	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;

//	returns "small" if 50 or less employees, "medium" if between 51 and 250 employees, 
//	"large" if greater than 250 employees.
	
	public String getCompanySize() {
		
		if(numberOfEmployees <= 50) {
			return "small";
		}
		if(numberOfEmployees <= 250) {
			return "medium";
		}
		return "large";
	}
	
	public double getProfit() {
		return revenue-expenses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public double getExpenses() {
		return expenses;
	}

	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	
	
	
	
	
}
