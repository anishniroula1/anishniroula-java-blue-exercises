package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumerals {

	public static String convertToRomanNumeral(int num) {
		if (num < 1 || num > 3999) {
			return "Invalid";
		}
		String str = "";
		while (num >= 1000) {
			str += "M";
			num -= 1000;
		}
		while (num >= 900) {
			str += "CM";
			num -= 900;
		}
		while (num >= 500) {
			str += "D";
			num -= 500;
		}
		while (num >= 400) {
			str += "CD";
			num -= 400;
		}
		while (num >= 100) {
			str += "C";
			num -= 100;
		}
		while (num >= 90) {
			str += "XC";
			num -= 90;
		}
		while (num >= 50) {
			str += "L";
			num -= 50;
		}
		while (num >= 40) {
			str += "XL";
			num -= 40;
		}
		while (num >= 10) {
			str += "X";
			num -= 10;
		}
		while (num >= 9) {
			str += "IX";
			num -= 9;
		}
		while (num >= 5) {
			str += "V";
			num -= 5;
		}
		while (num >= 4) {
			str += "IV";
			num -= 4;
		}
		while (num >= 1) {
			str += "I";
			num -= 1;
		}
		
		return str;

	}

	public int convertToDigit(String romanNumeral) {

		if (romanNumeral == null) {
			return 0;
		}

		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int value = 0;
		for (int i = 0; i < romanNumeral.length(); i++) {
			int s1 = romanMap.get(romanNumeral.charAt(i));

			if (i + 1 < romanNumeral.length()) {
				int s2 = romanMap.get(romanNumeral.charAt(i + 1));

				if (s1 >= s2) {
					value += s1;
				} else {
					value += s2 - s1;
					i++;
				}
			} else {
				value += s1;
			}
		}
		return value;
	}

}
