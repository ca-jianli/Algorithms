package ca.jianli;

/**
 * 
 * Find square root of a double using binary search
 * 
 * @author Jian Li
 * 
 */

public class SqrtDouble {
	public static double sqrt(double x, double tol) {
		if (x < 0)
			throw new IllegalArgumentException("Negative input not allowed");
		
		double candidate, lo, hi;
		lo = 0;
		hi = x;
		candidate = (lo + hi) / 2.0;
		while (lo < hi - tol) {
			if (Math.abs(x / candidate - candidate) < tol)
				break;
			if (x / candidate > candidate)
				lo = candidate;
			else
				hi = candidate;
			candidate = (lo + hi) / 2.0;
		}
		return candidate;
	}
}
