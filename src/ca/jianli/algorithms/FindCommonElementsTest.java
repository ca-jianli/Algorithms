package ca.jianli.algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class FindCommonElementsTest {

	@Test
	public void test1() {
		int[] A = new int[] { 0, 1, 2, 3 };
		int[] B = new int[] { 2, 4 };
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		assertEquals(expected, FindCommonElements.solution1(A, B));
	}

	@Test
	public void test2() {
		int[] A = new int[] {};
		int[] B = new int[] {};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		assertEquals(expected, FindCommonElements.solution1(A, B));
	}

	@Test
	public void test3() {
		int[] A = new int[] { 1, 2, 4, 5, 6 };
		int[] B = new int[] { 4, 6, 7, 8 };
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(4);
		expected.add(6);
		assertEquals(expected, FindCommonElements.solution1(A, B));
	}

	@Test
	public void test4() {
		int[] A = new int[] { 1, 2, 4, 5, 6 };
		int[] B = new int[] { 0, 1, 2, 4, 5, 6, 7, 8 };
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		assertEquals(expected, FindCommonElements.solution1(A, B));
	}
}
