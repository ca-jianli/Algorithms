package ca.jianli;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * O(n log log n) Eratosthenes Sieve for finding prime numbers, or seiving
 * non-primes from 1 to N
 * 
 * 1. Recognize for any i, for 4<=i<=N, there is a prime divisor that
 * is less or equal than sqrt(i)
 * 
 * 2. We only need to remove multiples of p, a prime number, for n >= p*p,
 * because smaller n has already been crossed out by a smaller prime divisor
 * than p, such as k*p.
 * 
 * @author Jian Li
 * 
 */
public class EratosthenesSieve {
	public static ArrayList<Integer> findPrime(int N) {
		if (N <= 1)
			return new ArrayList<Integer>();

		boolean[] primes = new boolean[N + 1];
		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i * i <= N; i++)
			if (primes[i])
				for (int k = i * i; k <= N; k += i)
					primes[k] = false;

		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < N + 1; i++)
			if (primes[i])
				res.add(i);
		return res;
	}

}
