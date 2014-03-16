package ca.jianli;

import java.util.ArrayList;
import java.util.HashMap;

public class FibonacciFrog {

	public static int solution(int[] A) {
		// write your code in Java SE 7
		ArrayList<Integer> river = new ArrayList<Integer>();
		for (int a : A) {
			river.add(a);
		}
		river.add(1);

		ArrayList<Integer> fib = new ArrayList<Integer>();
		int a = 0;
		int b = 1;
		while (true) {
			int x = a + b;
			if (x > river.size())
				break;
			fib.add(x);
			a = b;
			b = x;
		}

		HashMap<Integer, Integer> prevs = new HashMap<Integer, Integer>();
		prevs.put(-1, 0);
		for (int i = 0; i < river.size(); i++) {
			if (river.get(i) == 1) {
				int min = Integer.MAX_VALUE;
				for (int f : fib) {
					if (prevs.containsKey((i - f))) {
						min = Math.min(min, prevs.get(i - f) + 1);
					}
				}
				if (min != Integer.MAX_VALUE) {
					prevs.put(i, min);
				}
			}
		}

		return prevs.containsKey(river.size() - 1) ? prevs
				.get(river.size() - 1) : -1;
	}

	public static void main(String[] arg) {
		System.out
				.println(solution(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
	}
}
