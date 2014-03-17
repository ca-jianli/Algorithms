package ca.jianli.javasnippets;

/**
 * Use binary search to find the first occurrence of an integer value in a
 * sorted array of integers, where duplicates are allowed.
 * 
 * @author Jian Li
 * 
 */
public class FindFirstOccurrenceInSortedArray {
	public static int solution1(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length - 1;
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (nums[mid] >= target) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return nums[lo] == target ? lo : -1;
	}
}
