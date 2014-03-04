package ca.jianli;

import java.util.HashMap;

/**
 * Implements a Least Recently Used cache.  
 * oj.leetcode.com/problems/lru-cache
 * 
 * @author Jian Li
 * 
 */

public class LRUCache {
	public class Node {
		int key;
		Integer value;
		Node prev;
		Node next;

		public Node(int k, Integer v) {
			key = k;
			value = v;
		}
	}

	private HashMap<Integer, Node> cache;
	private Node head;
	private Node tail;
	private int capacity;

	public LRUCache(int c) {
		cache = new HashMap<Integer, Node>();
		head = tail = null;
		capacity = c;
	}

	public int get(int key) {
		if (!cache.containsKey(key))
			return -1; // or throw exceptions
		Node node = cache.get(key);
		moveToHead(node);
		return node.value;
	}

	private void moveToHead(Node node) {
		if (head == node)
			return;

		// extract node from doubly linked list
		node.prev.next = node.next;
		if (tail == node)
			tail = node.prev;
		else
			node.next.prev = node.prev;

		// move node to head
		node.prev = null;
		node.next = head;
		node.next.prev = node;
		head = node;
	}

	public void set(int key, int value) {
		if (!cache.containsKey(key)) {
			if (cache.size() == capacity) {
				// remove old node from cache
				cache.remove(tail.key);
				
				// update queue
				tail.key = key;
				tail.value = value;
				
				// put new node into cache
				cache.put(key,  tail);
				
				moveToHead(tail);
			} else {
				Node node = new Node(key, value);
				cache.put(key, node);
				if (head == null)
					head = tail = node;
				else {
					node.next = head;
					head.prev = node;
					head = node;
				}
			}
		} else {
			Node node = cache.get(key);
			node.value = value;
			moveToHead(node);
		}
	}
}
