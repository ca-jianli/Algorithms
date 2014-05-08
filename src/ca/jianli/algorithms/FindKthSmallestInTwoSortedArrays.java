package ca.jianli.algorithms;

/**
 * Algorithm to find Kth element of two sorted arrays. The idea is to use binary
 * search to achieve log(n) performance. Each iteration reduces required K by
 * half (approximately).
 * 
 * @author Jian Li
 * 
 */
public class FindKthSmallestInTwoSortedArrays {
	public static int solution1(int[] A, int[] B, int k) {
		return findKth(A, 0, B, 0, k);
	}

	/**
	 * Find kth element in sorted array A, starting from element a, and array B,
	 * starting from element b.
	 * 
	 * @param A
	 *            first array
	 * @param a
	 *            valid data starting point for A
	 * @param B
	 *            second array
	 * @param b
	 *            valid data starting point for B
	 * @param k
	 *            the target rank of the element we are searching
	 * @return the kth element
	 */

	private static int findKth(int[] A, int a, int[] B, int b, int k) {
		int aSize = A.length - a;
		int bSize = B.length - b;

		// maintain invariant A < B

		if (aSize > bSize)
			return findKth(B, b, A, a, k);

		// take care of corner cases

		if (aSize == 0)
			return B[b + k - 1];
		if (k == 1)
			return Math.min(A[a], B[b]);

		// number of elements to look into array A and array B
		// invariant is dA + dB = k

		int dA = Math.min(aSize, k / 2);
		int dB = k - dA;

		// drop a number of elements proportional to K, which are known to be
		// smaller than Kth element.

		if (A[a + dA - 1] < B[b + dB - 1])
			return findKth(A, a + dA, B, b, k - dA);
		else
			return findKth(A, a, B, b + dB, k - dB);
	}
}
