package ca.jianli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsTest {

	@Test
	public void test1() {
		String s = "hello world";
		String e = "world hello";
		assertEquals(e, ReverseWords.reverseWords(s));
	}

	@Test
	public void test2() {
		String s = " i am reversed ";
		String e = " reversed am i ";
		assertEquals(e, ReverseWords.reverseWords(s));
	}

	@Test
	public void test3() {
		String s = " space in front";
		String e = "front in space ";
		assertEquals(e, ReverseWords.reverseWords(s));
	}

	@Test
	public void test4() {
		String s = "space at back ";
		String e = " back at space";
		assertEquals(e, ReverseWords.reverseWords(s));
	}

	@Test
	public void test5() {
		String s = "";
		String e = "";
		assertEquals(e, ReverseWords.reverseWords(s));
	}

	@Test
	public void test6() {
		String s = "  ";
		String e = "  ";
		assertEquals(e, ReverseWords.reverseWords(s));
	}

	@Test
	public void test7() {
		String s = "space";
		String e = "space";
		assertEquals(e, ReverseWords.reverseWords(s));
	}
}
