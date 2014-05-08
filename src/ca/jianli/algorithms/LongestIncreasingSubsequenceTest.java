package ca.jianli.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingSubsequenceTest {

	@Test
	public void test1() {
		int[] input = new int[] { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3,
				11, 7, 15 };
		Integer[] expected = new Integer[] { 0, 2, 6, 9, 11, 15 };
		Integer[] actual = (Integer[]) (LongestIncreasingSubsequence.solution1(input)
				.toArray(new Integer[expected.length]));

		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void test2() {
		int[] input = new int[] { 0, 0, 0, 0 };
		Integer[] expected = new Integer[] { 0 };
		Integer[] actual = (Integer[]) (LongestIncreasingSubsequence.solution1(input)
				.toArray(new Integer[expected.length]));

		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void test3() {
		int[] input = new int[] { 3, 2, 1 };
		Integer[] expected = new Integer[] { 1 };
		Integer[] actual = (Integer[]) (LongestIncreasingSubsequence.solution1(input)
				.toArray(new Integer[expected.length]));

		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		int[] input = new int[] { 8, 1, 2, 3, 0, 5 };
		Integer[] expected = new Integer[] { 1, 2, 3, 5 };
		Integer[] actual = (Integer[]) (LongestIncreasingSubsequence.solution1(input)
				.toArray(new Integer[expected.length]));

		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test5() {
		int[] input = new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		Integer[] expected = new Integer[] { 10, 22, 33, 41, 60, 80 };
		Integer[] actual = (Integer[]) (LongestIncreasingSubsequence.solution1(input)
				.toArray(new Integer[expected.length]));

		Assert.assertArrayEquals(expected, actual);
	}
}
