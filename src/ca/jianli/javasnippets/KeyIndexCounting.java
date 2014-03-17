package ca.jianli.javasnippets;

/**
 * Implement sorting of a string using key-index counting. Given the number of
 * different keys is small compared to in size
 * 
 * @author Jian Li
 * 
 */

public class KeyIndexCounting {
	private static int R = 26;

	public static String sort(String s) {
		char[] in = s.toCharArray();
		int[] count = new int[R + 1];
		char[] aux = new char[in.length];

		// count number of occurrences for each key.

		for (char c : in) {
			count[(c - 'a') + 1]++;
		}

		// count[c] = the starting location of key=c in the sorted array

		for (int i = 0; i < R; i++) {
			count[i + 1] += count[i];
		}

		// fill in the final sorted array aux

		for (int i = 0; i < in.length; i++) {
			aux[count[in[i] - 'a']++] = in[i];
		}
		return new String(aux);
	}
}
