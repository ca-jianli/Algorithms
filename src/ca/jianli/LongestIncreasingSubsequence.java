package ca.jianli;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Find the longest increasing subsequence in an array of integers. O(nlogn)
 * http://en.wikipedia.org/wiki/Longest_increasing_subsequence
 * @author Jian
 * 
 */
public class LongestIncreasingSubsequence {

	public static ArrayDeque<Integer> lsi(int[] input) {
		// longest(i) is the index k of input[k], which is the last element of 
		// a increasing subsequence of length i.
		// longest(0) is not valid for non-trivial input, and has a value of -1.
		
		ArrayList<Integer> longest = new ArrayList<Integer>();
		longest.add(-1);
		
		// prev[i] contains the previous element index of the last element of a
		// increasing subsequence. 
		
		int[] prev = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int insertLocation = bst(input, longest, i);
			if (insertLocation > longest.size() - 1) {
				longest.add(i);
			} else {
				longest.set(insertLocation, i);
			}
			prev[i] = longest.get(insertLocation - 1);
		}

		// build longest subsequence output from prev[]
		
		ArrayDeque<Integer> output = new ArrayDeque<Integer>();
		int last = longest.get(longest.size() - 1);
		while (last != -1) {
			output.addFirst(input[last]);
			last = prev[last];
		}
		return output;
	}

	private static int bst(int[] input, ArrayList<Integer> longest, int i) {
		int lo = 1;
		int hi = longest.size() - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (input[longest.get(mid)] < input[i])
				lo = mid + 1;
			else
				hi = mid - 1;
		}
		return lo;
	}

	public static void main(String[] args) {
		System.out.println("Start");

		int[] input = new int[] { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3,
				11, 7, 15 };

		System.out.println(lsi(input));

		System.out.println("Finish");

	}
}
