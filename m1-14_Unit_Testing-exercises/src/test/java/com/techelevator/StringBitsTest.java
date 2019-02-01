package com.techelevator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class StringBitsTest {
	private StringBits stringBits;
	
	@Before
	public void setup() {
		stringBits = new StringBits();
	}
	
	@Test
	public void new_string_made_of_every_other_char() {
		String mix = stringBits.getBits("Heeololeo");
		Assert.assertEquals("Hello", mix);
	}
	@Test
	public void if_there_is_no_String() {
		String mix = stringBits.getBits("");
		Assert.assertEquals("", mix);
	}
}
