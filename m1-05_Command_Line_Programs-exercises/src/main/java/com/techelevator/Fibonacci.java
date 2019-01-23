package com.techelevator;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		 
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter the Fibonacci number: ");
	    		int fibonacciNum=in.nextInt();
	    		
	  		int a=0;
	   		int b=1;
			int i = 0;
	   		while(i<=fibonacciNum)
	   		{
	       			System.out.print(i+" ");
	       			a=b;
	       			b=i;
	       			i=a+b;
	   		}
		}
	}


