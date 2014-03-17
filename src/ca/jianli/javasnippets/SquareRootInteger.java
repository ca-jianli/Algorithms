package ca.jianli.javasnippets;

/**
 * Implement sqrt(int) using binary search.
 * 
 * @author Jian Li
 * 
 */

public class SquareRootInteger {
	public static int solution1(int x) {
		if (x == 0)
			return 0;

		if (x < 0)
			throw new IllegalArgumentException("Negative input not allowed.");

		int lo = 1;
		int hi = x;
		int mid = (lo + hi) / 2;
		while (lo <= hi) {
			if (x / mid == mid)
				return mid;
			if (x / mid > mid)
				lo = mid + 1;
			else
				hi = mid - 1;
			mid = (lo + hi) / 2;
		}
		return lo - 1;
	}
}
