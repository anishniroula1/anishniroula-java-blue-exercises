package com.techelevator;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a Number: ");
		int fNum = in.nextInt();
		int previousNumber = 0;
		int nextNumber = 1;
		for (int i = 0; i <fNum; i++) {
			System.out.print(previousNumber+ " ");
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
            nextNumber = sum;
		}
	}

}

