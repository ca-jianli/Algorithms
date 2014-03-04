package ca.jianli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMedianUsingTwoHeapTest {

	@Test
	public void test1() {
		FindMedianUsingTwoHeap dut = new FindMedianUsingTwoHeap();
		dut.add(1);
		assertEquals(1.0, dut.getMedian(), 0.001);
		dut.add(2);
		assertEquals(1.5, dut.getMedian(), 0.001);
		dut.add(7);
		dut.add(10);
		dut.add(5);
		assertEquals(5, dut.getMedian(), 0.001);
		dut.add(11);
		assertEquals(6, dut.getMedian(), 0.001);
	}

}
