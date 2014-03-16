package ca.jianli;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Count the minimum number of jumps required for a frog to get to the other
 * side of a river.
 * 
 * Input array consists of 1's and 0's, one represent leaf that frog can land
 * on, 0 is water.
 * 
 * Frog can make Fibonacci numbered jumps only.
 * 
 * @author Jian Li
 * 
 */
public class FibonacciFrog {

	public static int solution(int[] A) {
		// find all fib numbers for size of A
		ArrayList<Integer> fib = new ArrayList<Integer>();
		int a = 0;
		int b = 1;
		while (true) {
			int x = a + b;
			if (x > A.length + 1)
				break;
			fib.add(x);
			a = b;
			b = x;
		}

		// maintain a queue of starting locations for jump, and do a BFS using
		// all fib numbers; number of fib numbers is O(logN)

		Queue<Integer> next = new ArrayDeque<Integer>();
		next.add(-1); // add starting location on one side of river

		int numJumps = 1;
		while (!next.isEmpty()) {
			int size = next.size();
			for (int i = 0; i < size; i++) {
				int from = next.remove();
				for (int f : fib) {
					int to = from + f;
					if (to == A.length) {
						// reached destination
						return numJumps;
					} else if (to > A.length || A[to] == 0) {
						// no leaf to land on, or exceeded target, or already
						// visited
					} else {
						next.add(to);
						// mark as visited
						A[to] = 0;
					}
				}
			}
			numJumps++;
		}
		// no more place to jump from and haven't reached other end.

		return -1;
	}

	public static void main(String[] arg) {
		System.out
				.println(solution(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
	}
}
