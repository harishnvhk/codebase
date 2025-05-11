package com.harish;

class MyThread extends Thread {

	// overriding thread method
	public void run() {
		System.out.println("Thread using Thread class is running");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Count: " + i);

			try {
				Thread.sleep(500); // pause for 500 milliseconds
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}

		}
	}
}