package com.voytovych.basic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestThreadsReentrantLock {

	public static void main(String[] args) {
        
		MarketNews3 mn = new MarketNews3("Market News");
        mn.start();

        Portfolio3 p = new Portfolio3("Portfolio data");
        p.start();
        
        ReentrantLock theLock = new ReentrantLock();
        final Condition notDone = theLock.newCondition();
        
        theLock.lock();
        try {
			System.out.println("Starting to wait...");
			notDone.await(15, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println("The main thread is interrupted");
		}
        
        theLock.unlock();
	}

}
