package ca.jianli;

/**
 * Reverse bits in a Integer.  Same as Integer.reverse(int a);
 * >>> right sfift withouy sign extension.
 * O(logn) where n is number of bits.
 * 
 * @author Jian Li
 *
 */
public class ReverseBits {
	public static int solution1(int x) {
		// ABCD_DCBA
		x = ((x & 0x0000FFFF) << 16) | ((x & 0xFFFF0000) >>> 16);
		// DCBA_ABCD
		x = ((x & 0x00FF00FF) << 8) | ((x & 0xFF00FF00) >>> 8);
		// BADC_CDAB
		x = ((x & 0x0F0F0F0F) << 4) | ((x & 0xF0F0F0F0) >>> 4);
		x = ((x & 0x33333333) << 2) | ((x & 0xCCCCCCCC) >>> 2);
		x = ((x & 0x55555555) << 1) | ((x & 0xAAAAAAAA) >>> 1);
		return x;
	}

}
