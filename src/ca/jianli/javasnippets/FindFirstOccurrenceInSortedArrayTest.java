package ca.jianli.javasnippets;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class FindFirstOccurrenceInSortedArrayTest {

	@Test
	public void test1() {
		int[] nums = new int[] { 1, 2, 2 };
		assertEquals(0, FindFirstOccurrenceInSortedArray.solution1(nums, 1));
		assertEquals(1, FindFirstOccurrenceInSortedArray.solution1(nums, 2));
		assertEquals(-1, FindFirstOccurrenceInSortedArray.solution1(nums, 0));
	}

	@Test
	public void test2() {
		int[] nums = new int[] { -1, -1, 2, 2, 3, 3, 3, 4, 4, 5, 5 };
		assertEquals(2, FindFirstOccurrenceInSortedArray.solution1(nums, 2));
		assertEquals(4, FindFirstOccurrenceInSortedArray.solution1(nums, 3));
	}

	@Test
	public void test3() {
		for (int i = 0; i < 500; i++) {
			Random random = new Random();
			int m = random.nextInt(100) + 1;
			int[] nums = new int[m];
			for (int j = 0; j < m; j++) {
				nums[j] = random.nextInt(10);
			}
			Arrays.sort(nums);
			int target = random.nextInt(10);
			int expected = -1;
			for (int j = 0; j < m; j++) {
				if (nums[j] == target) {
					expected = j;
					break;
				}
			}
			assertEquals(expected,
					FindFirstOccurrenceInSortedArray.solution1(nums, target));
		}
	}
}
