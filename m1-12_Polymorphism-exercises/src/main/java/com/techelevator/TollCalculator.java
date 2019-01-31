package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TollCalculator {

	public static void main(String[] args) {
		List<Vechicle> vechicles  = new ArrayList<Vechicle>();
		
		Car withNoTrailer = new Car(false);
		Car withTrailer = new Car(true);
		
		Truck with4Axles = new Truck(4);
		Truck with6Axles = new Truck(6);
		Truck with8MoreAxles = new Truck(8);
		
		
		vechicles.add(with8MoreAxles);
		vechicles.add(with6Axles);
		vechicles.add(with4Axles);
		vechicles.add(withTrailer);
		vechicles.add(withNoTrailer);
		vechicles.add(new Tank());
		
		int countDistance = 0;
		double countToll  = 0.0;
		
		System.out.printf("%1s           %10s        %8s", "Vechicle","Distance Traveled ", "Toll $");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		
		for (Vechicle tollVechicles : vechicles) {
			Random tollRandom = new Random();
			int randomToll = tollRandom.nextInt(240)+10;
			
			System.out.printf("%1s           %10s           $%4.2f", tollVechicles.getType(),randomToll, tollVechicles.calculateToll(randomToll));
			System.out.println();
			//System.out.println(tollVechicles.getType() + randomToll+ " " +tollVechicles.calculateToll(randomToll));
			countDistance += randomToll;
			countToll += tollVechicles.calculateToll(randomToll);
			
		}
		
		System.out.println();
		System.out.printf("%-10s %4d", "Total Miles Traveled:",countDistance);
		System.out.println();
		System.out.printf("%10s  %1s%4.2f", "Total Tollbooth Revenue:", "$", countToll);
	}

}
