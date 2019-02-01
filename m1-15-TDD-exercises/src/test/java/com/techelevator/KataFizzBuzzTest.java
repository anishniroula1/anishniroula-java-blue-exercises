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

}
