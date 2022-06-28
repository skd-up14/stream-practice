package com.souvik.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {

	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		DeadlockExample dd = new DeadlockExample();
		
		dd.deadlockMethod(lock1, lock2);

	}

	private void deadlockMethod(Lock l1, Lock l2) {
		
		
		new Thread(new Task1(l1, l2)).start();
		new Thread(new Task2(l1, l2)).start();
	}

	
	
	
}
