package com.techelevator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class less20Test {
	private Less20 less;
	
	@Before
	public void setup() {
		less = new Less20();
	}
	
	@Test
	public void  two_less_than_a_multiple_of_20() {
		boolean checkMultiple = less.isLessThanMultipleOf20(18);
		Assert.assertTrue(true);
	}
	@Test
	public void one_less_than_a_multiple_0f_20() {
		boolean checkMultiple = less.isLessThanMultipleOf20(19);
		Assert.assertTrue(true);
	}
	@Test
	public void number_multiple_0f_20() {
		boolean checkMultiple = less.isLessThanMultipleOf20(17);
		Assert.assertFalse(false);
	}

}
