package ca.jianli;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class FindKthSmallestInTwoSortedArraysTest {

	@Test
	public void test1() {
		int[] a = new int[] { 1, 2 };
		int[] b = new int[] { 3 };
		assertEquals(2, FindKthSmallestInTwoSortedArrays.findKth(a, b, 2));
		assertEquals(1, FindKthSmallestInTwoSortedArrays.findKth(a, b, 1));
		assertEquals(3, FindKthSmallestInTwoSortedArrays.findKth(a, b, 3));

	}

	@Test
	public void test2() {
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 2, 3, 4 };
		assertEquals(2, FindKthSmallestInTwoSortedArrays.findKth(a, b, 3));
		assertEquals(2, FindKthSmallestInTwoSortedArrays.findKth(a, b, 2));
		assertEquals(3, FindKthSmallestInTwoSortedArrays.findKth(a, b, 4));
		assertEquals(3, FindKthSmallestInTwoSortedArrays.findKth(a, b, 5));
		assertEquals(1, FindKthSmallestInTwoSortedArrays.findKth(a, b, 1));
		assertEquals(4, FindKthSmallestInTwoSortedArrays.findKth(a, b, 6));
	}

	@Test
	public void test3() {
		Random randomGenerator = new Random();
		for (int i = 0; i < 50; i++) {
			int aSize = randomGenerator.nextInt(10) + 1;
			int bSize = randomGenerator.nextInt(10) + 1;
			int k = randomGenerator.nextInt(aSize + bSize) + 1;
			int[] a = new int[aSize];
			int[] b = new int[bSize];
			int[] c = new int[aSize + bSize];
			for (int j = 0; j < aSize; j++) {
				a[j] = randomGenerator.nextInt(10);
				c[j] = a[j];
			}
			for (int j = 0; j < bSize; j++) {
				b[j] = randomGenerator.nextInt(10);
				c[aSize + j] = b[j];
			}
			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);

			assertEquals(c[k - 1],
					FindKthSmallestInTwoSortedArrays.findKth(a, b, k));
		}
	}
}
