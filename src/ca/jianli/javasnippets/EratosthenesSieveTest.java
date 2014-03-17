package ca.jianli.javasnippets;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class EratosthenesSieveTest {

	@Test
	public void test1() {
		int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
				41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
		ArrayList<Integer> e = new ArrayList<Integer>();
		for (int p : primes)
			e.add(p);
		assertEquals(e, EratosthenesSieve.findPrime(100));
	}

}
