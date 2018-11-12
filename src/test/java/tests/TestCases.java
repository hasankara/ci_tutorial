package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.Multiply;
import controller.Sum;

public class TestCases {

	@Test
	public void testMultiply() {
		Multiply multiply = new Multiply();	
		assertEquals(10, multiply.multiplyNumbers(5, 2));
		assertEquals(-3, multiply.multiplyNumbers(3, -1));
		assertEquals(40, multiply.multiplyNumbers(5, 8));
	}
	@Test
	public void testSum() {
		Sum sum = new Sum();	
		assertEquals(7,  sum.sumNumbers(5, 2));
		assertEquals(2,  sum.sumNumbers(3, -1));
		assertEquals(13,  sum.sumNumbers(5, 8));
	}
}
