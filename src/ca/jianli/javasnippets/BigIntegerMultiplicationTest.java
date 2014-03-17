package ca.jianli.javasnippets;

import static org.junit.Assert.*;

import org.junit.Test;

public class BigIntegerMultiplicationTest {

	@Test
	public void test1() {
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 3 };
		int[] c = new int[] { 0, 3, 6, 9 };
		assertArrayEquals(c, BigIntegerMultiplication.solution1(a, b));
	}

	@Test
	public void test2() {
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 4, 5, 6 };
		int[] c = new int[] { 0, 5, 6, 0, 8, 8 };
		assertArrayEquals(c, BigIntegerMultiplication.solution1(a, b));
	}

	@Test
	public void test3() {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] c = new int[] { 1, 2, 1, 9, 3, 2, 6, 3, 1, 1, 1, 2, 6, 3, 5, 2,
				6, 9 };
		assertArrayEquals(c, BigIntegerMultiplication.solution1(a, b));
	}
}
