package com.techelevator;

public class Airplane {
private String planeNumber;
private int bookedFirstClassSeats; 
private int totalFirstClassSeats;
private int bookedCoachSeats;
private int totalCoachSeats;

public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
	this.planeNumber = planeNumber;
	this.totalCoachSeats  = totalCoachSeats;
	this.totalFirstClassSeats = totalFirstClassSeats;
	
}

public int getAvailableFirstClassSeats() {
	return totalFirstClassSeats - bookedFirstClassSeats;
}

public int getAvailableCoachSeats() {
	return totalCoachSeats - bookedCoachSeats;
}


/*
 * - `reserveSeats()` is a method
  - if firstClass is true, reserve the value for `totalNumberOfSeats` for first class
  - if firstClass is false, reserve the value for `totalNumberOfSeats` for coach
  - return `true` if the reservation can be made, `false` if it cannot
 */

public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
	
	if(forFirstClass) {
		if(totalNumberOfSeats>getAvailableFirstClassSeats()) {
			
			return false;
		}
		bookedFirstClassSeats  +=totalNumberOfSeats;
	}
		
				
	else {
		if(totalNumberOfSeats>getAvailableCoachSeats()) {
			return false;
		}
		bookedCoachSeats +=totalNumberOfSeats;
		}
	return true;
	
}

public String getPlaneNumber() {
	return planeNumber;
}

public int getBookedFirstClassSeats() {
	return bookedFirstClassSeats;
}

public int getTotalFirstClassSeats() {
	return totalFirstClassSeats;
}

public int getBookedCoachSeats() {
	return bookedCoachSeats;
}

public int getTotalCoachSeats() {
	return totalCoachSeats;
}

}
