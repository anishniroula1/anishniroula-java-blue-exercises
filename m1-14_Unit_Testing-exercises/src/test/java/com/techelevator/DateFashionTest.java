package com.techelevator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DateFashionTest {
	private DateFashion fashion;
	
	@Before
	public void setup() {
		fashion = new DateFashion();
	
}
	@Test
	public void get_table_with_2() {
		int table = fashion.getATable(5, 10);
		Assert.assertEquals(2, table);
	}
	@Test
	public void get_table_with_0() {
		int table = fashion.getATable(2, 2);
		Assert.assertEquals(0, table);
	}
	@Test
	public void get_table_with_1() {
		int table = fashion.getATable(5, 5);
		Assert.assertEquals(1, table);
	}

}
