package ca.jianli.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseBitsTest {

	@Test
	public void test1() {
		assertEquals(0xFFFF0000, ReverseBits.solution1(0x0000FFFF));
	}

	@Test
	public void test2() {
		assertEquals(0x00000000, ReverseBits.solution1(0x00000000));
	}

	@Test
	public void test3() {
		assertEquals(0x88888888, ReverseBits.solution1(0x11111111));
	}

	@Test
	public void test4() {
		assertEquals(0xAAAA5555, ReverseBits.solution1(0xAAAA5555));
	}

	@Test
	public void test5() {
		int a = 123124;
		int b = Integer.reverse(a);
		assertEquals(b, ReverseBits.solution1(a));
	}
}
