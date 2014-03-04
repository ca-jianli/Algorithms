package ca.jianli;

import static org.junit.Assert.*;

import org.junit.Test;

public class SqrtDoubleTest {

	@Test
	public void test1() {
		double in = 4;
		double tol = in * 0.01;
		assertEquals(Math.sqrt(in), SqrtDouble.sqrt(in, tol), tol);
	}

	@Test
	public void test2() {
		double in = 12345;
		double tol = in * 0.01;
		assertEquals(Math.sqrt(in), SqrtDouble.sqrt(in, tol), tol);
	}

	@Test
	public void test3() {
		double in = 0;
		double tol = in * 0.01;
		assertEquals(Math.sqrt(in), SqrtDouble.sqrt(in, tol), tol);
	}

	@Test
	public void test4() {
		double in = Double.MAX_VALUE;
		double tol = in * 0.01;
		assertEquals(Math.sqrt(in), SqrtDouble.sqrt(in, tol), tol);
	}
}
