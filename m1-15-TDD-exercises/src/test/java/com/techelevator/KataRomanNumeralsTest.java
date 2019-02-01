package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	private KataRomanNumerals target;
	
	@Before
	public void setup() {
		target = new KataRomanNumerals();
	}
	
	@Test
	public void convert_single_character() {
		//String roman = "I";
		
		Assert.assertEquals("Failed to convert I",1, target.convertToDigit("I"));
		Assert.assertEquals("Failed to convert V",5, target.convertToDigit("V"));
		Assert.assertEquals("Failed to convert X",10, target.convertToDigit("X"));
	}
	
	@Test
	public void convert_tripples_of_single_character() {
		//int result = target.convertToDigit("III");
		Assert.assertEquals("Failed to convert III",3, target.convertToDigit("III"));
		Assert.assertEquals("Failed to convert XXX",30, target.convertToDigit("XXX"));
		Assert.assertEquals("Failed to convert XVI",316, target.convertToDigit("XVI"));
	}

}
