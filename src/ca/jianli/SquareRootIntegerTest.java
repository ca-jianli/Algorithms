package ca.jianli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareRootIntegerTest {

	@Test
	public void test1() {
		assertEquals(0, SquareRootInteger.sqrt(0));
	}

	@Test
	public void test2() {
		assertEquals((int) Math.sqrt(5), SquareRootInteger.sqrt(5));
	}

	@Test
	public void test3() {
		assertEquals(1, SquareRootInteger.sqrt(1));
	}

	@Test
	public void test4() {
		assertEquals((int) Math.sqrt(2), SquareRootInteger.sqrt(2));
	}

	@Test
	public void test5() {
		assertEquals((int) Math.sqrt(Integer.MAX_VALUE),
				SquareRootInteger.sqrt(Integer.MAX_VALUE));
	}
}
