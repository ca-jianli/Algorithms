package ca.jianli.javasnippets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OverlappingDiscsTest {

	@Test
	public void test1() {
		assertEquals(11,
				OverlappingDiscs.solution1(new int[] { 1, 5, 2, 1, 4, 0 }));
	}
	
	@Test
	public void test2() {
		assertEquals(11,
				OverlappingDiscs.solution2(new int[] { 1, 5, 2, 1, 4, 0 }));
	}
}
