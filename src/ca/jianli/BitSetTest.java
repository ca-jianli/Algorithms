package ca.jianli;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BitSetTest {

	@Test
	public void test1() {
		BitSet set = new BitSet(10000);
		set.set(0);
		assertEquals(true, set.isSet(0));
		set.clear(0);
		assertEquals(false, set.isSet(0));
		set.set(2);
		set.set(2);
		set.set(4);
		set.set(5);
		assertEquals(true, set.isSet(2));
		set.clear(2);
		assertEquals(false, set.isSet(2));
		assertEquals(true, set.isSet(4));
		assertEquals(true, set.isSet(5));
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test2() {
		BitSet set = new BitSet(64);
		set.set(63);
		assertEquals(true, set.isSet(63));
		set.clear(63);
		assertEquals(false, set.isSet(63));
		thrown.expect(ArrayIndexOutOfBoundsException.class);
		set.set(64);
	}
}
