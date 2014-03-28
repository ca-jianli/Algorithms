package ca.jianli.javasnippets;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

public class ThreadSafeBlockingQueueTest {

	static class Taker implements Runnable {
		private static int count = 0;
		int mID;
		ThreadSafeBlockingQueue<Integer> queue;

		public Taker(ThreadSafeBlockingQueue<Integer> q) {
			queue = q;
			mID = count++;
		}

		@Override
		public void run() {
			while (true) {
				try {

					Thread.sleep(ThreadLocalRandom.current().nextInt(100) + 100);
					queue.take();
				} catch (InterruptedException e) {
				}
			}
		}
	}

	static class Putter implements Runnable {
		private static int count = 0;
		int mID;
		ThreadSafeBlockingQueue<Integer> queue;

		public Putter(ThreadSafeBlockingQueue<Integer> q) {
			queue = q;
			mID = count++;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(ThreadLocalRandom.current().nextInt(100) + 100);
					int x = ThreadLocalRandom.current().nextInt(10);
					queue.put(x);
				} catch (InterruptedException e) {
				}

			}
		}
	}

	@Test
	public void test() {
		ThreadSafeBlockingQueue<Integer> queue = new ThreadSafeBlockingQueue<Integer>(
				5);
		ArrayList<Thread> childThreads = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(new Putter(queue));
			childThreads.add(t);
			t.start();
		}
		for (int i = 0; i < 1; i++) {
			Thread t = new Thread(new Taker(queue));
			childThreads.add(t);
			t.start();
		}
		try {
			Thread.sleep(2000);
			for (Thread t : childThreads) {
				t.interrupt();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
