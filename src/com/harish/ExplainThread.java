package com.harish;

class ExplainThread {
	public static void main(String[] args) {
		
		//Using Thread Class
		MyThread thread = new MyThread();
		thread.start();
		//thread.run();

		//Using Runnable
		MyRunnable myRunnable = new MyRunnable();
		Thread runnable = new Thread(myRunnable); // Pass object to Thread
		runnable.start();
	}
}
