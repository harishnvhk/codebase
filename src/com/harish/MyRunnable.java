package com.harish;

class MyRunnable implements Runnable {
	
	//overriding run
	public void run() {
		System.out.println("Thread using Runnable interface is running");
	}
}