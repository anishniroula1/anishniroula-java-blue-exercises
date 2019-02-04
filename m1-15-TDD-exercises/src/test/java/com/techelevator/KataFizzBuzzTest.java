package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;


public class KataFizzBuzzTest {
	private KataFizzBuzz fizzBuzz;
	
	
	@Before
	public void setup() {
		fizzBuzz = new KataFizzBuzz();
	}
	@Test
	public void num_division_by_3() {
		String type = fizzBuzz.fizzBuzz(9);
		Assert.assertEquals("Fizz", type);
	}
	@Test
	public void num_division_by_5() {
		String type = fizzBuzz.fizzBuzz(20);
		Assert.assertEquals("Buzz", type);
	}
	@Test
	public void num_division_by_3_and_5() {
		String type = fizzBuzz.fizzBuzz(15);
		Assert.assertEquals("FizzBuzz", type);
	}
	@Test
	public void num_is_not_division_by_3_and_5() {
		String type = fizzBuzz.fizzBuzz(22);
		Assert.assertEquals("22", type);
	}
	
	@Test
	public void num_is_greater_than_100_or_less_than_0_not_division_by_3_or_5() {
		String type = fizzBuzz.fizzBuzz(101);
		Assert.assertEquals("", type);
	}
	@Test
	public void num_contains_3_and_division_by_3() {
		String type = fizzBuzz.fizzBuzz(13);
		Assert.assertEquals("Fizz", type);
	}
	@Test
	public void num_contains_5_and_division_by_5() {
		String type = fizzBuzz.fizzBuzz(50);
		Assert.assertEquals("Buzz", type);
	}
	@Test
	public void num_contains_3() {
		String type = fizzBuzz.fizzBuzz(13);
		Assert.assertEquals("Fizz", type);
	}
	@Test
	public void num_contains_5() {
		String type = fizzBuzz.fizzBuzz(25);
		Assert.assertEquals("Buzz", type);
	}
	@Test
	public void num_contains_3_and_5_and_division_by_3_and_5() {
		String type = fizzBuzz.fizzBuzz(35);
		Assert.assertEquals("FizzBuzz", type);
	}

}
