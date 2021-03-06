package ca.jianli.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QuickSelectTest {

	@Test
	public void test1() {
		int[] nums = new int[] { 5, 1 };
		assertEquals(1, QuickSelect.solution1(nums, 1));
		assertEquals(5, QuickSelect.solution1(nums, 2));
	}

	@Test
	public void test2() {
		int[] nums = new int[] { 2, 1, 1 };
		assertEquals(1, QuickSelect.solution1(nums, 1));
		assertEquals(1, QuickSelect.solution1(nums, 2));
		assertEquals(2, QuickSelect.solution1(nums, 3));
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test3() {
		int[] nums = new int[] { 2, 3, 7, 11 };
		thrown.expect(IllegalArgumentException.class);
		assertEquals(1, QuickSelect.solution1(nums, 0));
		assertEquals(1, QuickSelect.solution1(nums, 5));
	}
}
