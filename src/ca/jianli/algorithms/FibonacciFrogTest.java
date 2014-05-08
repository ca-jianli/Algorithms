package ca.jianli.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciFrogTest {

	@Test
	public void test1() {
		assertEquals(2, FibonacciFrog.solution(new int[] { 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1 }));
	}

	@Test
	public void test2() {
		assertEquals(
				3,
				FibonacciFrog.solution(new int[] { 0, 0, 0, 1, 1, 0, 1, 0, 0,
						0, 0 }));
	}
}
