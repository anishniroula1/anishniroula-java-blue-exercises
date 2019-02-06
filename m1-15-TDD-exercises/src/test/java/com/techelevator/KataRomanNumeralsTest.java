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
		Assert.assertEquals("Failed to convert L",50, target.convertToDigit("L"));
		Assert.assertEquals("Failed to convert C",100, target.convertToDigit("C"));
		Assert.assertEquals("Failed to convert D",500, target.convertToDigit("D")); 
		Assert.assertEquals("Failed to convert M",1000, target.convertToDigit("M"));
		
	}
	
	@Test
	public void convert_tripples_of_single_character() {
		//int result = target.convertToDigit("III");
		Assert.assertEquals("Failed to convert III",3, target.convertToDigit("III"));
		Assert.assertEquals("Failed to convert XXX",30, target.convertToDigit("XXX"));
	Assert.assertEquals("Failed to convert XVI",16, target.convertToDigit("XVI"));
	Assert.assertEquals(700, target.convertToDigit("DCC"));
	Assert.assertEquals(1435, target.convertToDigit("MCDXXXV"));
	
	}
	
	@Test
	public void convert_String_to_number() {
		Assert.assertEquals("MCDXXXV", target.convertToRomanNumeral(1435));
		Assert.assertEquals("M", target.convertToRomanNumeral(1000));
		Assert.assertEquals("MMMCDLVI", target.convertToRomanNumeral(3456));
		
		
	}

}
