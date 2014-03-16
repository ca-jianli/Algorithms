package ca.jianli;

import java.util.Random;

/**
 * Calculate the number of elements of an array that are not divisors of each
 * element.
 * 
 * Element n satisfies 1<=n<=2*A.length
 * 
 * Codility (C)
 * 
 * 
 * @author Jian Li
 * 
 */
public class PrimeNondivisors {
	public static int[] solution(int[] A) {
		// count the number of of same elements
		int N = A.length * 2;
		int[] count = new int[N + 1];
		for (int a : A) {
			count[a]++;
		}

		// calculate the number of divisors for each number betwen 1 and N
		int[] divisors = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j * j <= i; j++) {
				if (i % j == 0) {
					if (i / j == j) {
						divisors[i] += count[j];
					} else {
						divisors[i] += count[j];
						divisors[i] += count[i / j];
					}
				}
			}
		}

		// calculate non-divisors for each element of A
		int[] res = new int[A.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = A.length - divisors[A[i]];
		}

		return res;
	}

	public static void main(String[] args) {
		Random r = new Random();
		int N = r.nextInt(10);
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			input[i] = r.nextInt(N * 2) + 1;
			System.out.print(input[i] + " ");
		}
		System.out.println();
		int[] res = solution(input);
		for (int n : res) {
			System.out.print(n + " ");
		}
	}
}
