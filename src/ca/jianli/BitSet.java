package ca.jianli;

/**
 * Implement a bit set with fixed capacity, and the method set(), clear(),
 * isSet()
 * 
 * @author Jian Li
 * 
 */

public class BitSet {
	int[] mem;
	int count;

	public BitSet(int capacity) {
		mem = new int[(capacity + 31) / 32];
		count = 0;
	}

	public void set(int key) {
		int block = key / 32;
		int offset = key % 32;
		mem[block] |= (1 << offset);
	}

	public void clear(int key) {
		int block = key / 32;
		int offset = key % 32;
		mem[block] &= ~(1 << offset);

	}

	public boolean isSet(int key) {
		int block = key / 32;
		int offset = key % 32;
		return (mem[block] & (1 << offset)) != 0;
	}
}
