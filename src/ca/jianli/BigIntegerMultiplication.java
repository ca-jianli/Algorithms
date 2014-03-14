package ca.jianli;

/**
 * Implement multiplication of large integers, overflow possible therefore
 * representing using array.
 * 
 * This can be extended to a stream of integer input b, multiplying by a known
 * integer a.
 * 
 * This version is more cache-friendly compared with the standard long
 * multiplication.
 * 
 * @author Jian Li
 */

public class BigIntegerMultiplication {
	public static int[] solution1(int[] a, int[] b) {
		int a_size = a.length;
		int b_size = b.length;
		int[] res = new int[a_size + b_size];
		int[] buffer = new int[a_size + 1];

		for (int j = b_size - 1; j >= 0; j--) {
			int carry = 0;

			// buffer tracks the intermediate sum, buffer[a_size] is calculated
			// for each iteration of j, and then never changed again. So assign
			// it to result at the end of each loop.

			for (int i = a_size; i > 0; i--) {
				buffer[i] = buffer[i - 1] + b[j] * a[i - 1] + carry;
				carry = buffer[i] / 10;
				buffer[i] %= 10;
			}
			buffer[0] = carry;
			res[a_size + j] = buffer[a_size];
		}

		// flush the rest of sum digits from buffer to result

		for (int i = a_size - 1; i >= 0; i--) {
			res[i] = buffer[i];
		}

		return res;
	}
}
