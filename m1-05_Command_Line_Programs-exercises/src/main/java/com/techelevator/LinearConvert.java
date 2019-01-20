package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the length: ");
		int length = in.nextInt();
		System.out.println("Is the measurement in (m)eter, or (f)eet? ");
		char mOrF = in.next().charAt(0);
		double m;
		double f;
		if (mOrF=='M'|| mOrF=='m') {
//			m = f * 0.3048
//			f = m * 3.2808399
			
			 m= length *3.2808399;
			 System.out.print(length +"M"+ " = ");
			 System.out.printf("%4.2fF", m);
			
		}
		else if (mOrF=='f'|| mOrF=='F') {
			f = length * 0.3048;
			System.out.print(length +"F"+ " = ");
			 System.out.printf("%4.2fM", f);
		}
		else {
			System.out.println("Please enter Valid Char M or F");
			
		}
			
		
		}


	


}



