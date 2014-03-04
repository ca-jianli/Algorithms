package ca.jianli;

import java.util.ArrayList;

/**
 * A simple program to find the common elements (overlap) between two sorted
 * arrays A and B. O(n)
 * 
 * @author Jian Li
 * 
 */
public class FindCommonElements {
	public static ArrayList<Integer> findCommon(int[] A, int[] B) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (A.length == 0 || B.length == 0)
			return res;
		int i, j;
		i = j = 0;
		while (i < A.length && j < B.length) {
			if (A[i] == B[j]) {
				res.add(A[i]);
				i++;
				j++;
			} else if (A[i] < B[j]) {
				i++;
			} else {
				j++;
			}
		}
		return res;
	}
}
