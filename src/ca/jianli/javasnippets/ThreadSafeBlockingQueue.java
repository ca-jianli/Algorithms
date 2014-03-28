package ca.jianli.javasnippets;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Implement a generic fixed capacity queue that is thread safe. Put() blocks on
 * full, and take() blocks on empty.
 * 
 * @author Jian Li
 * 
 * @param <T>
 */
public class ThreadSafeBlockingQueue<T> {
	final Lock lock = new ReentrantLock();
	final Condition notFull = lock.newCondition();
	final Condition notEmpty = lock.newCondition();
	final T[] items;
	int pWrite = 0;
	int pRead = 0;
	int count = 0;

	@SuppressWarnings("unchecked")
	public ThreadSafeBlockingQueue(int capacity) {
		if (capacity <= 0)
			throw new IllegalArgumentException();
		items = (T[]) new Object[capacity];
	}

	private void insert(T t) {
		items[pWrite] = t;
		pWrite = inc(pWrite);
		++count;
		notEmpty.signal();
		System.out.println(Thread.currentThread().getName() + " inserts: "
				+ toString());
	}

	private T extract() {
		T t = items[pRead];
		items[pRead] = null;
		pRead = inc(pRead);
		--count;
		notFull.signal();
		System.out.println(Thread.currentThread().getName() + " extracts: "
				+ toString());
		return t;
	}

	public void put(T t) throws InterruptedException {
		lock.lock();
		try {
			while (count == items.length)
				notFull.await();
			insert(t);

		} finally {
			lock.unlock();
		}
	}

	public T take() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0)
				notEmpty.await();
			return extract();
		} finally {
			lock.unlock();
		}
	}

	private int inc(int pRead) {
		pRead++;
		return pRead == items.length ? 0 : pRead;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		int current = pRead;
		int read = 0;
		while (read < count) {
			sb.append(items[current] + " ");
			current = inc(current);
			++read;
		}
		sb.append("]");
		return sb.toString();
	}
}
