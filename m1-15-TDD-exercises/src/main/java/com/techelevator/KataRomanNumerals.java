package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumerals {
	
	public int convertToDigit(String romanNumeral) {
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		
		romanMap.put('I',1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100); 
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		romanMap.get(romanNumeral);
		System.out.println(romanNumeral.length());
		
		int value = 0;
		for (int i = 0; i< romanNumeral.length(); i++) {
			value += romanMap.get(romanNumeral.charAt(i));
			//System.out.println(romanMap);
		}
				
				
		//System.out.println(romanNumeral.charAt(i));

		return value;
		
	} 

}
