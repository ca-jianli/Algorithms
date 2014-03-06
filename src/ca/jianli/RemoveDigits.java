package ca.jianli;

import java.util.Stack;

/**
 * A O(n) algorithm to remove k digits from a non-negative integer such that the
 * resulting integer is the smallest.
 * 
 * Examples: 42319, k = 3, result = 19; 1002, k = 1, result = 2
 * 
 * @author Jian Li
 * 
 */
public class RemoveDigits {
	public static int getNew(int num, int k) {

		if (num < 0)
			throw new IllegalArgumentException("Input must be greater than 0.");

		Stack<Integer> s = new Stack<Integer>();
		char[] in = new Integer(num).toString().toCharArray();

		for (char c : in) {

			// if current digit is smaller than the previous digit remove the
			// previous digit, it's better to remove the digit before.

			int msb = c - '0';
			while (!s.isEmpty() && msb < s.peek() && k > 0) {
				s.pop();
				k--;
			}

			s.push(msb);
		}

		// if finished and still need to remove more digit, start from the end
		// since the digits are in increasing order

		while (!s.isEmpty() && k > 0) {
			s.pop();
			k--;
		}

		int res = 0;
		for (int d : s) {
			res = res * 10 + d;
		}

		return res;
	}
}
