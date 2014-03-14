package ca.jianli;

/**
 * Find k-th smallest number in an array of integers using quick-partition.
 * Solve in O(n) time on average on a shuffled list.
 * 
 * Example: 3142, 2 -> 2
 * 
 * @author Jian Li
 * 
 */
public class QuickSelect {
	public static int solution1(int[] nums, int k) {
		if (k > nums.length || k < 1)
			throw new IllegalArgumentException("K is not Valid.");

		return qs(nums, k - 1, 0, nums.length - 1);
	}

	private static int qs(int[] nums, int k, int start, int end) {

		// pivot is selected to be first element, all other elements compare to
		// pivot
		int p = nums[start];

		// pass through remaining elements in range, skip over smaller element,
		// and move large element to end of range

		int lo = start + 1;
		int hi = end;
		while (lo <= hi) {
			if (p >= nums[lo])
				lo++;
			else {
				swap(nums, lo, hi);
				hi--;
			}
		}

		// put pivot in place

		int i = lo - 1;
		swap(nums, start, i);

		// if pivot index matches k, return pivot, or else probabilistically we
		// have divided the range in half

		if (i == k)
			return nums[i];
		else if (i > k)
			return qs(nums, k, start, i - 1);
		else
			return qs(nums, k, i + 1, end);
	}

	private static void swap(int[] nums, int lo, int hi) {
		int tmp = nums[lo];
		nums[lo] = nums[hi];
		nums[hi] = tmp;
	}
}
