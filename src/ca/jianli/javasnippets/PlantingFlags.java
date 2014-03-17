package ca.jianli.javasnippets;

/**
 * Find the maximum number of flags that can be set on mountain peaks.
 * 
 * Codility (C)
 * 
 * @author Jian Li
 * 
 */
public class PlantingFlags {
	// you can also use imports, for example:
	// import java.math.*;
	public static int solution(int[] A) {
		// write your code in Java SE 7
		boolean[] peaks = new boolean[A.length];
		int numPeaks = 0;
		for (int i = 1; i < A.length - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				peaks[i] = true;
				numPeaks++;
			}
		}

		if (numPeaks < 2)
			return numPeaks;

		// bisection
		int lo = 2;
		int hi = (int) Math.sqrt(A.length) + 1; // can at most take SQRT(N)
												// flags

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (check(mid, peaks)) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}

		return lo - 1;
	}

	/**
	 * Check if N flags can be planted with each flag at least N distance apart.
	 */
	private static boolean check(int N, boolean[] peaks) {
		int flags = 0;
		int pos = 0;
		while (pos < peaks.length) {
			if (peaks[pos]) {
				flags++;
				pos += N;
				if (flags == N)
					return true;
			} else {
				pos++;
			}
		}
		return false;
	}

}
