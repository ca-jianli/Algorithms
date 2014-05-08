package ca.jianli.algorithms;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Input array A of N non-negative integers representing N circles of radius
 * A[i], 0 <= i < N, centered on a 2D plane at (i, 0).
 * 
 * Find total number of pairs of discs that overlap.
 * 
 * For example: A[6] = {1, 5, 2, 1, 4, 0} Return 11
 * 
 * @author Jian Li
 * 
 */

public class OverlappingDiscs {

	/**
	 * This is a nlogn solution. Represent discs as intervals. Sort the
	 * intervals on starting point. Loop through the intervals, and find the
	 * insert location of the ending point in the array of starting points.
	 * 
	 * @param A
	 * @return
	 */
	public static int solution1(int[] A) {

		ArrayList<Interval> list = new ArrayList<Interval>();
		for (int i = 0; i < A.length; i++) {
			int s = Math.max(0, i - A[i]);
			int e = Math.min(A.length - 1, i + A[i]);
			list.add(new Interval(s, e));
		}

		Collections.sort(list);

		int ret = 0;

		for (int i = 0; i < list.size(); i++) {
			int rank = getRank(list, i);
			ret += Math.max(0, rank - 1 - i);
		}
		return ret;
	}

	/**
	 * O(N) solution using counting. Instead of sorting, we track the number of
	 * intervals starting and ending at each i. Active tracks the existing
	 * overlapping intervals. Any interval starting at i would form i *
	 * active[i] number of pairs. In addition, we add (N, 2) combinations of all
	 * intervals starting at i.
	 * 
	 * @param A
	 * @return
	 */
	public static int solution2(int[] A) {
		int ret = 0;
		int[] start = new int[A.length];
		int[] end = new int[A.length];
		int[] active = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			start[Math.max(0, i - A[i])]++;
			end[Math.min(A.length - 1, i + A[i])]++;
		}
		for (int i = 1; i < A.length; i++) {
			active[i] = active[i - 1] + start[i - 1] - end[i - 1];
		}

		for (int i = 0; i < start.length; i++) {
			if (start[i] == 0)
				continue;
			ret += start[i] * active[i];
			ret += start[i] * (start[i] - 1) / 2;
		}
		return ret;
	}

	public static class Interval implements Comparable<Interval> {
		int start;
		int end;

		public Interval(int s, int e) {
			start = s;
			end = e;
		}

		public int compareTo(Interval that) {
			if (this.start < that.start)
				return -1;
			if (this.start > that.start)
				return 1;
			return 0;
		}

	}

	private static int getRank(ArrayList<Interval> list, int i) {
		int lo = 0;
		int hi = list.size() - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (list.get(mid).start > list.get(i).end) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}

}
