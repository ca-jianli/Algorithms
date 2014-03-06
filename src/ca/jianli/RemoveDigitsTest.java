package ca.jianli;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDigitsTest {

	@Test
	public void test1() {
		assertEquals(1, RemoveDigits.getNew(1, 0));
		assertEquals(42319, RemoveDigits.getNew(42319, 0));
		assertEquals(2319, RemoveDigits.getNew(42319, 1));
		assertEquals(219, RemoveDigits.getNew(42319, 2));
		assertEquals(19, RemoveDigits.getNew(42319, 3));
		assertEquals(1, RemoveDigits.getNew(42319, 4));
		assertEquals(0, RemoveDigits.getNew(42319, 5));
		assertEquals(0, RemoveDigits.getNew(42319, 6));
	}

	@Test
	public void test2() {
		assertEquals(0, RemoveDigits.getNew(100, 1));
		assertEquals(10, RemoveDigits.getNew(230010, 2));
		assertEquals(0, RemoveDigits.getNew(230010, 3));
		assertEquals(0, RemoveDigits.getNew(230010, 4));
	}
}
