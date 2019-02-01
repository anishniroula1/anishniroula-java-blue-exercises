package com.techelevator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class CigarPartyTest {
	
	private CigarParty cigarParty;
	
	@Before
	public void setup() {
		cigarParty = new CigarParty();
	}
	@Test
	public void when_the_number_of_cigars_is_between_40_and_60() {
		boolean isParty = cigarParty.haveParty(40, false);
		Assert.assertTrue(isParty);
	}
	@Test
	public void when_the_number_of_cigars_doesnot_meet_requirement() {
		boolean isParty = cigarParty.haveParty(30, true);
		Assert.assertFalse(isParty);
	}
}
