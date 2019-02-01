package com.techelevator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class NonStartTest {
	private NonStart nonStart;
	
	@Before
	public void setup() {
		nonStart = new NonStart();
	}
	
	@Test
	public void string_concatenation_after_first_char() {
		String returnVal = nonStart.getPartialString("Hello", "Friend");
		Assert.assertEquals("elloriend", returnVal);
	}
	@Test
	public void string_concatenation_if_one_string() {
		String returnVal = nonStart.getPartialString("h", "");
		Assert.assertEquals("", returnVal);
	}
	@Test
	public void string_concatenation_if_one_on_both_string() {
		String returnVal = nonStart.getPartialString("", "h");
		Assert.assertEquals("", returnVal);
	}

}
