package ca.jianli;

/**
 * Implement cubic root of an double using binary search.
 * 
 * @author Jian Li
 * 
 */
public class CubicRootDouble {
	public static double solution1(double x, double tol) {
		if (x == 0)
			return 0;

		if (x < 0 || tol <= 0)
			throw new IllegalArgumentException(
					"Negative input and/or non-positive tolerance not allowed");

		double lo = 0;
		double hi = x;

		// Tricky part, 0.5 for example has a cube root of 0.7..., so candidate
		// for x < 1 needs to cover up to 1;

		double candidate = Math.max(1, (lo + hi) / 2.0);
		while (lo < hi - tol) {
			if (Math.abs(x / candidate - candidate * candidate) < tol)
				break;
			if (x / candidate > candidate * candidate)
				lo = candidate;
			else
				hi = candidate;
			candidate = (lo + hi) / 2.0;
		}
		return candidate;
	}
}
