package com.souvik.threads;

import java.util.concurrent.locks.Lock;

public class Task2 implements Runnable{
	
	Lock lock1;
	Lock lock2;
	
	

	public Task2(Lock lock1, Lock lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}



	@Override
	public void run() {
		lock2.lock();
		lock1.lock();
		
		lock1.unlock();
		lock2.unlock();
		
	}
	
}