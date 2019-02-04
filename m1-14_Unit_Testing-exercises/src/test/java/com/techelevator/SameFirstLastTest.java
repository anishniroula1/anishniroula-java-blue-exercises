package com.techelevator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class SameFirstLastTest {
	
	private SameFirstLast equal;
	
	@Before
	public void setup() {
		equal = new SameFirstLast();
	}
	
	@Test
	public void true_if_first_and_last_is_same() {
		boolean checkEqual = equal.isItTheSame(new int[] {1, 2, 1});
		Assert.assertTrue(true);
	}
	@Test
	public void check_if_first_and_last_is_same() {
		boolean checkEqual = equal.isItTheSame(new int[] {1, 2, 3});
		Assert.assertFalse(false);
	}
	@Test
	public void check_if_first_and_second_is_same() {
		boolean checkEqual = equal.isItTheSame(new int[] {});
		Assert.assertFalse(false);
	}
	@Test
	public void check_if_onely_one() {
		boolean checkEqual = equal.isItTheSame(new int[] {1});
		Assert.assertFalse(false);
	}
}
