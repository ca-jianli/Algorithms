package ca.jianli.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantingFlagsTest {

	@Test
	public void test1() {

		assertEquals(
				3,
				PlantingFlags.solution(new int[] { 1, 5, 3, 4, 3, 4, 1, 2, 3,
						4, 6, 2 }));
	}

}
