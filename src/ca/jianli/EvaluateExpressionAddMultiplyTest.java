package ca.jianli;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvaluateExpressionAddMultiplyTest {

	@Test
	public void test1() {
		assertEquals(35, EvaluateExpressionAddMultiply.solution1("3*5+4*5"));
		assertEquals(10, EvaluateExpressionAddMultiply.solution1("1+2+3+4"));
		assertEquals(24, EvaluateExpressionAddMultiply.solution1("1*2*3*4"));
	}

}
