package com.techelevator;

public class Car implements Vechicle {

	private boolean hasTrailer;

	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}

	public double calculateToll(int distance) {
		double toll = distance * 0.020;
		if (hasTrailer == true) {

			toll = toll + 1.00;

		}
		return toll;
	}

	@Override
	public String getType() {
		if(hasTrailer == true) {
		return "Car With Trailer";
	}
		else {
			return "Car             ";
		}
	}
}
