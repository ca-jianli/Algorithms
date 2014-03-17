package ca.jianli.javasnippets;

import static org.junit.Assert.*;

import org.junit.Test;

public class KMPSubstrSearchTest {

	@Test
	public void test1() {
		KMPSubstrSearch kmp = new KMPSubstrSearch("needle");
		int start = kmp.find("find a needle in a haystack");
		assertEquals(7, start);
	}
	@Test
	public void test2() {
		KMPSubstrSearch kmp = new KMPSubstrSearch("abc");
		int start = kmp.find("bbcacababc");
		assertEquals(7, start);
	}
	@Test
	public void test3() {
		KMPSubstrSearch kmp = new KMPSubstrSearch("findme");
		int start = kmp.find("findme");
		assertEquals(0, start);
	}	
	@Test
	public void test4() {
		KMPSubstrSearch kmp = new KMPSubstrSearch("xyz");
		int start = kmp.find("abcdefg");
		assertEquals(-1, start);
	}
	
	@Test
	public void test5() {
		KMPSubstrSearch kmp = new KMPSubstrSearch("abc");
		int start = kmp.find("a");
		assertEquals(-1, start);
	}	
}
