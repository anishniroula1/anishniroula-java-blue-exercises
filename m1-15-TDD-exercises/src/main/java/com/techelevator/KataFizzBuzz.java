package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzz(int number) {
	    String endOutput = "";      
	    if(number > 100 || number < 1) {
	        endOutput = "";
	    }
	    else if ((String.valueOf(number).contains("5") && String.valueOf(number).contains("3")) || 
	    		(number % 3 == 0 && number % 5 == 0)) {
			return "FizzBuzz";
		}
	    else if (number % 3 == 0 && number % 5 == 0) {
	        endOutput = "FizzBuzz";
	    }
	    else if (number % 3 == 0 || Integer.toString(number).contains("3")) {
	        endOutput = "Fizz";
	    }
	    else if (number % 5 == 0 || Integer.toString(number).contains("5")) {
	        endOutput = "Buzz";
	    }
	    else {
	        endOutput = Integer.toString(number);
	    }
	    return endOutput;
	}
	}