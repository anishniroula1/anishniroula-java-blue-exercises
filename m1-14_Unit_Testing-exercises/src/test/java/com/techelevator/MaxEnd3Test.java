package com.techelevator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class MaxEnd3Test {
	private MaxEnd3 maxEnd;
	
	@Before
	public void setup() {
		maxEnd = new MaxEnd3();
		
	}
	@Test
	public void whic_is_large_in_last_in_array() {
		int[] returnVal = maxEnd.makeArray(new int[] {1, 2, 3});
		Assert.assertArrayEquals(new int[] {3, 3, 3}, returnVal);
	}
	@Test
	public void whic_is_large_in_first_in_array() {
		int[] returnVal = maxEnd.makeArray(new int[] {6, 2, 3});
		Assert.assertArrayEquals(new int[] {6,6,6}, returnVal);
	}

}
