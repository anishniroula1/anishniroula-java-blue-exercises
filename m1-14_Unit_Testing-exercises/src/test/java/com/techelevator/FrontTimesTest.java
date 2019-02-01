package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FrontTimesTest {
	private FrontTimes returnString;


@Before
	public void setup() {
	returnString = new FrontTimes();
}

@Test
public void return_2_first_index_in_char() {
	String newString = returnString.generateString("Chocolate", 2);
	Assert.assertEquals("ChoCho", newString);
}
@Test
public void return_3_first_index_in_char() {
	String newString = returnString.generateString("Chocolate", 3);
	Assert.assertEquals("ChoChoCho", newString);
}
@Test
public void return_String_That_count_first_3_char() {
	String newString = returnString.generateString("Abc", 3);
	Assert.assertEquals("AbcAbcAbc", newString);
}
}