package ca.jianli.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareRootIntegerTest {

	@Test
	public void test1() {
		assertEquals(0, SquareRootInteger.solution1(0));
	}

	@Test
	public void test2() {
		assertEquals((int) Math.sqrt(5), SquareRootInteger.solution1(5));
	}

	@Test
	public void test3() {
		assertEquals(1, SquareRootInteger.solution1(1));
	}

	@Test
	public void test4() {
		assertEquals((int) Math.sqrt(2), SquareRootInteger.solution1(2));
	}

	@Test
	public void test5() {
		assertEquals((int) Math.sqrt(Integer.MAX_VALUE),
				SquareRootInteger.solution1(Integer.MAX_VALUE));
	}
}
