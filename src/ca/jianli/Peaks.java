package ca.jianli;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Divide an array into the maximum number of same-sized blocks, each of which
 * should contain an index P such that A[P - 1] < A[P] > A[P + 1]
 * 
 * Codility (C)
 * 
 * @author Jian Li
 * 
 */
public class Peaks {
	public static int solution(int[] A) {

		// Find and store the peaks in order
		ArrayList<Integer> peaks = new ArrayList<Integer>();
		for (int i = 1; i < A.length - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				peaks.add(i);
			}
		}

		// corner case
		if (peaks.size() == 0)
			return 0;

		// store all divisors of array A size, in order
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		int candidate = 2;
		while (candidate * candidate < A.length) {
			if (A.length % candidate == 0) {
				divisors.add(candidate);
				divisors.add(A.length / candidate);
			}
			candidate++;
		}
		if (candidate * candidate == A.length) {
			divisors.add(candidate);
		}

		Collections.sort(divisors);

		// try all divisors from the smallest to largest, and see if each block
		// contains at least one peak

		for (int divisor : divisors) {
			boolean divisible = true;
			int block = 1; // the block # being examined
			int i = 0; // the peak # being examined
			// iterate through all blocks from 1 to last
			while (block <= A.length / divisor) {
				boolean peakExist = false;
				while (i < peaks.size()) {
					int peak = peaks.get(i);
					// move pass all peaks in the current block
					if (peak > block * divisor - 1)
						break;
					// at least one peak exists in the current block
					peakExist = true;
					i++;
				}
				if (!peakExist) {
					divisible = false;
					break;
				}
				block++;
			}
			// return the # blocks by the smallest divisor
			if (divisible)
				return A.length / divisor;
		}

		// if all divisors >= 2 fails to divide, return one block guaranteed.
		return 1;
	}
}
