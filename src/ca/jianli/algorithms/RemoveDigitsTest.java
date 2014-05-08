package ca.jianli.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDigitsTest {

	@Test
	public void test1() {
		assertEquals(1, RemoveDigits.solution1(1, 0));
		assertEquals(42319, RemoveDigits.solution1(42319, 0));
		assertEquals(2319, RemoveDigits.solution1(42319, 1));
		assertEquals(219, RemoveDigits.solution1(42319, 2));
		assertEquals(19, RemoveDigits.solution1(42319, 3));
		assertEquals(1, RemoveDigits.solution1(42319, 4));
		assertEquals(0, RemoveDigits.solution1(42319, 5));
		assertEquals(0, RemoveDigits.solution1(42319, 6));
	}

	@Test
	public void test2() {
		assertEquals(0, RemoveDigits.solution1(100, 1));
		assertEquals(10, RemoveDigits.solution1(230010, 2));
		assertEquals(0, RemoveDigits.solution1(230010, 3));
		assertEquals(0, RemoveDigits.solution1(230010, 4));
	}
}
