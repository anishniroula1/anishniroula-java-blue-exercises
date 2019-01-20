package com.techelevator;
import java.util.*;
public class TempConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the temperature: ");
		int temp = in.nextInt();
		System.out.println("Is the temperature in (C)elcius, or (F)arenheit?: ");
		char cOrF = in.next().charAt(0);
		double tC;
		double tF;
		if (cOrF=='f'|| cOrF=='F') {
//			Tc = (Tf - 32) / 1.8
//			Tf = Tc * 1.8 + 32
			
			 tC= ((temp-32)/1.8);
			 System.out.print(temp +"F"+ " = ");
			 System.out.printf("%4.2fC", tC);
			
		}
		else if (cOrF=='c'|| cOrF=='C') {
			tF = temp * 1.8 +32;
			System.out.print(temp +"C"+ " = ");
			 System.out.printf("%4.2fF", tF);
		}
		else {
			System.out.println("Please enter Valid Char C or F");
			
		}
			
		
		}

}
