package ca.jianli.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeaksTest {

	@Test
	public void test1() {
		assertEquals(3, Peaks.solution(new int[] { 0, 1, 0, 1, 0, 1, 0, 1, 0 }));
		assertEquals(1, Peaks.solution(new int[] { 0, 1, 0 }));
		assertEquals(0, Peaks.solution(new int[] { 0 }));
		assertEquals(0, Peaks.solution(new int[] { 0, 1, 2, }));
		assertEquals(3, Peaks.solution(new int[] { 1, 2, 3, 4, 3, 4, 1, 2, 3,
				4, 6, 2 }));
	}
}
