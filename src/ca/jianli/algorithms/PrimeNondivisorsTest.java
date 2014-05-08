package ca.jianli.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNondivisorsTest {

	@Test
	public void test1() {
		assertArrayEquals(new int[] { 2, 4, 3, 2, 0 },
				PrimeNondivisors.solution(new int[] { 3, 1, 2, 3, 6 }));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[] { 0, 0 },
				PrimeNondivisors.solution(new int[] { 2, 2 }));
	}

	@Test
	public void test3() {
		assertArrayEquals(new int[] { 4, 3, 3, 3, 3 },
				PrimeNondivisors.solution(new int[] { 1, 8, 9, 7, 10 }));
	}

}
