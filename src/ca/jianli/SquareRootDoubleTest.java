package ca.jianli;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareRootDoubleTest {

	@Test
	public void test1() {
		double in = 4;
		double tol = in * 0.01;
		assertEquals(Math.sqrt(in), SquareRootDouble.solution1(in, tol), tol);
	}

	@Test
	public void test2() {
		double in = 12345;
		double tol = in * 0.01;
		assertEquals(Math.sqrt(in), SquareRootDouble.solution1(in, tol), tol);
	}

	@Test
	public void test3() {
		double in = 0;
		double tol = in * 0.01;
		assertEquals(Math.sqrt(in), SquareRootDouble.solution1(in, tol), tol);
	}

	@Test
	public void test4() {
		double in = Double.MAX_VALUE;
		double tol = in * 0.01;
		assertEquals(Math.sqrt(in), SquareRootDouble.solution1(in, tol), tol);
	}

	@Test
	public void test5() {
		double in = 0.5;
		double tol = in * 0.01;
		assertEquals(Math.sqrt(in), SquareRootDouble.solution1(in, tol), tol);
	}
}
