package ca.jianli;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class CubicRootDoubleTest {

	@Test
	public void test1() {

		double x;
		x = 100;
		assertEquals(Math.pow(x, 1.0 / 3), CubicRootDouble.cubic(x, x * 0.01),
				x * 0.01);
		x = 1;
		assertEquals(Math.pow(x, 1.0 / 3), CubicRootDouble.cubic(x, x * 0.01),
				x * 0.01);
		x = 0.5;
		assertEquals(Math.pow(x, 1.0 / 3), CubicRootDouble.cubic(x, x * 0.01),
				x * 0.01);
		x = 0;
		assertEquals(Math.pow(x, 1.0 / 3), CubicRootDouble.cubic(x, x * 0.01),
				x * 0.01);
		for (int i = 0; i < 100; i++) {
			x = new Random().nextDouble() * 100;
			assertEquals(Math.pow(x, 1.0 / 3),
					CubicRootDouble.cubic(x, x * 0.01), x * 0.01);

			// tolerance for x < 1 needs to be increased.

			x = new Random().nextDouble();
			assertEquals(Math.pow(x, 1.0 / 3),
					CubicRootDouble.cubic(x, x * 0.001), x * 0.01);
		}

	}

}
