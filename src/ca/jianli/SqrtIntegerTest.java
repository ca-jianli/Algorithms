package ca.jianli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SqrtIntegerTest {

	@Test
	public void test1() {
		assertEquals(0, SqrtInteger.sqrt(0));
	}

	@Test
	public void test2() {
		assertEquals((int) Math.sqrt(5), SqrtInteger.sqrt(5));
	}

	@Test
	public void test3() {
		assertEquals(1, SqrtInteger.sqrt(1));
	}

	@Test
	public void test4() {
		assertEquals((int) Math.sqrt(2), SqrtInteger.sqrt(2));
	}

	@Test
	public void test5() {
		assertEquals((int) Math.sqrt(Integer.MAX_VALUE),
				SqrtInteger.sqrt(Integer.MAX_VALUE));
	}
}
