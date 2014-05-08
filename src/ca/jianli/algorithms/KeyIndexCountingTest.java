package ca.jianli.algorithms;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class KeyIndexCountingTest {

	@Test
	public void test1() {
		String in = "deadbeef";
		char[] inChar = in.toCharArray();
		Arrays.sort(inChar);
		assertEquals(new String(inChar), KeyIndexCounting.sort(in));
	}

	@Test
	public void test2() {
		String in = "a";
		char[] inChar = in.toCharArray();
		Arrays.sort(inChar);
		assertEquals(new String(inChar), KeyIndexCounting.sort(in));
	}
}
