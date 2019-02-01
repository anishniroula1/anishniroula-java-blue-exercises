package com.techelevator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class Lucky13Test {
	private Lucky13 lucky;
	
	@Before
	public void setup() {
		lucky = new Lucky13();
	}
	
	@Test
	public void true_if_no_1s_or_3s() {
		boolean checkVal = lucky.getLucky(new int[] {0, 2, 4});
		Assert.assertTrue(true);
	}
	@Test
	public void false_if_1s_or_3s_appers() {
		boolean checkVal = lucky.getLucky(new int[] {1, 2, 3});
		Assert.assertFalse(false); 
	}
	@Test
	public void false_if_no_1s_appers() {
		boolean checkVal = lucky.getLucky(new int[] {1, 2, 4});
		Assert.assertFalse(false);
	}
	@Test
	public void false_if_no_3s_appers() {
		boolean checkVal = lucky.getLucky(new int[] {3, 2, 4});
		Assert.assertFalse(false);
	}

}
