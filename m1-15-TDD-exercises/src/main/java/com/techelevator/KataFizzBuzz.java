package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzz(int num) {

		if (num <= 0 || num > 100) {

			return "";
		}
		
		
		//53
		if ((String.valueOf(num).contains("5") && String.valueOf(num).contains("3")) || (num % 3 == 0 && num % 5 == 0)) {
			return "FizzBuzz";
		}
//		if (String.valueOf(num).contains("3")) {
//			return "Fizz";
//		}
		if (String.valueOf(num).contains("5") || num % 5 == 0) {
			return "Buzz";
		}
		if (String.valueOf(num).contains("3") || num % 3 == 0) {
			return "Fizz";
		}
		
		
//		if (String.valueOf(num).contains("5")) {
//			return "Buzz";
//		}
		
		
		
		
		

		
		

//		if (num % 3 == 0 && num % 5 == 0) {
//			return "FizzBuzz";
//		}

		if (num % 3 != 0 && num % 5 != 0) {
			String one = Integer.toString(num);
			return one;
		}

//		if (num % 5 == 0) {
//			return "Buzz";
//		}
//		if (num % 3 == 0) {
//			return "Fizz";
//		}

		return null;

	}

}
