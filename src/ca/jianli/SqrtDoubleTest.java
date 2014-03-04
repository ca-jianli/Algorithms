package ca.jianli;

import static org.junit.Assert.*;

import org.junit.Test;

public class SqrtDoubleTest {

	@Test
	public void test1() {
		assertEquals(2.0, SqrtDouble.sqrt(4.0, 0.01), 0.001);
	}

	@Test
	public void test2() {
		assertEquals(Math.sqrt(12345), SqrtDouble.sqrt(12345, 0.01), 0.001);
	}

	@Test
	public void test3() {
		assertEquals(0, SqrtDouble.sqrt(0, 0.01), 0.001);
	}

}
