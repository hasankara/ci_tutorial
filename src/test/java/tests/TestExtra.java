package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.Sum;

public class TestExtra {

	@Test
	public void testSum() {
		Sum sum = new Sum();	
		assertEquals(3,  sum.sumNumbers(1, 2));
		assertEquals(100,  sum.sumNumbers(20, 80));
		assertEquals(160123,  sum.sumNumbers(160123, 0));
	}

}
