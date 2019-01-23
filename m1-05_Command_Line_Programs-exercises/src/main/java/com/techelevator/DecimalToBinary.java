package com.techelevator;
import java.util.*;

public class DecimalToBinary {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter in a series of decimal values (separated by spaces): ");
	String decimalValues = in.nextLine();
	String[] decimalValuesArray = decimalValues.split(" "); // makes array
	
	int[] decimalValuesInt = new int[decimalValuesArray.length];
	
	for(int i = 0; i<decimalValuesArray.length; i++) {
		decimalValuesInt[i] =Integer.parseInt(decimalValuesArray[i]);
		System.out.print(decimalValuesInt[i]+" in Binary is ");
		int count = decimalValuesInt[i];
		String binary = "";
		
		while(count>0) {
			int remainder = count %2;
			count= count/2;
			binary = String.valueOf(remainder)+binary;
			if(count==0) {
				System.out.println(": "+binary);
			}
			
		}
	}
	
	
	
}
}
