package com.jancy.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	
	private int i=0;
	private int j=0;
	
	Lock lockforI=new ReentrantLock();
	Lock lockforJ=new ReentrantLock();
	
	public void incrementI() {
		lockforI.lock();
		i++;
		lockforI.unlock();
	}

	public int getI() {
		return i;
	}


	 public void incrementJ() {
		lockforJ.lock();
		j++;
		lockforJ.unlock();
	}

	public int getJ() {
		return i;
	}








}
