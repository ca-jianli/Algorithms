package ca.jianli;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 
 * Implement findMedian(int[]) using two heaps. Can be used to find median of a
 * incoming stream.
 * 
 * @author Jian Li
 * 
 */
public class FindMedianUsingTwoHeaps {
	PriorityQueue<Integer> minHeap;
	PriorityQueue<Integer> maxHeap;

	public FindMedianUsingTwoHeaps() {
		minHeap = new PriorityQueue<Integer>(1);
		maxHeap = new PriorityQueue<Integer>(1, Collections.reverseOrder());
	}

	public void add(int x) {

		// Add new item to one of the heap, ensure size invariant, count diff <=
		// 1

		if (minHeap.size() >= maxHeap.size()) {
			maxHeap.add(x);
		} else {
			minHeap.add(x);
		}

		// Ensure order invariant, all minHeap > all maxHeap

		if (!maxHeap.isEmpty() && !minHeap.isEmpty()
				&& maxHeap.peek() > minHeap.peek()) {
			if (maxHeap.size() >= minHeap.size()) {
				minHeap.add(maxHeap.poll());
			} else {
				maxHeap.add(minHeap.poll());
			}
		}
	}

	public double getMedian() {
		if (minHeap.size() == 0 && maxHeap.size() == 0)
			throw new IllegalArgumentException("The stream is empty.");

		if (minHeap.size() == maxHeap.size()) {
			return (minHeap.peek() + maxHeap.peek()) / 2.0;
		} else if (minHeap.size() > maxHeap.size()) {
			return minHeap.peek();
		} else {
			return maxHeap.peek();
		}
	}
}
