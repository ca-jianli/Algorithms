package ca.jianli;

import static org.junit.Assert.*;

import org.junit.Test;

public class LRUCacheTest {

	@Test
	public void test1() {
		LRUCache lru = new LRUCache(2);
		lru.set(2, 1);
		lru.set(1, 1);
		lru.set(2, 3);
		lru.set(4, 1);
		assertEquals(-1, lru.get(1));
		assertEquals(3, lru.get(2));
	}
	
	@Test
	public void test2() {
		LRUCache lru = new LRUCache(2);
		lru.set(2, 1);
		lru.set(3, 2);
		assertEquals(2, lru.get(3));
		assertEquals(1, lru.get(2));
		lru.set(4, 3);
		assertEquals(1, lru.get(2));
		assertEquals(-1, lru.get(3));
		assertEquals(3, lru.get(4));
	}
}
