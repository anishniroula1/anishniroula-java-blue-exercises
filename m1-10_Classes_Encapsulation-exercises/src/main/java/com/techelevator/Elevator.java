package com.techelevator;

public class Elevator {
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;

	public Elevator(int totalNumberOffloors) {
		this.numberOfFloors = totalNumberOffloors;
		currentFloor = 1;
	}

	/*
	 * 
	 * `openDoor()` opens the elevator door. `closeDoor()` closes the elevator door.
	 * `goUp(int desiredFloor)` sends the elevator upward to the desired floor as
	 * long as the door is not open. Cannot go past last floor. `goDown(int
	 * desiredFloor)` sends the elevator downward to the desired floor as long as
	 * the door is not open. Cannot go past floor 1.
	 */
	public void openDoor() {
		doorOpen = true;
	}

	public void closeDoor() {
		doorOpen = false;
	}

	public void goUp(int desiredFloor) { // currentfloor + desiredfloor - if
		if (doorOpen == false) {
			if (currentFloor != numberOfFloors) {
				currentFloor += 1;
			}
		}
	}

	public void goDown(int desiredFloor) {
		if (doorOpen == false) {
			if (currentFloor != 1) {
				currentFloor -= 1;
			}

		}
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

}
