package com.techelevator;

public class Truck implements Vechicle{
	private int numberOfAxles;
	
	public Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}
	
	public double calculateToll(int distance) {
		double toll = 0;
		if(numberOfAxles == 4) {
			toll = distance * 0.040;
		}
		else if(numberOfAxles == 6) {
			toll = distance * 0.045;
		}
		else if(numberOfAxles>= 8) {
			toll = distance * 0.048;
		}
		
		return toll;
	}

	@Override
	public String getType() {
		if(numberOfAxles == 4) {
			return "Truck (4 Axles)";
		}
		else if(numberOfAxles == 6) {
			return "Truck (6 Axles)";
		}
		else if(numberOfAxles >= 8) {
			return "Truck (8+ Axles)";
		}
		return null;
	}

}
