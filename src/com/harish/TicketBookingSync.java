package com.harish;

class TicketBookingSync extends Thread {
	static int availableSeats = 5;
	static Object lock = new Object(); // shared lock

	// Integer intg= new Integer(10);

	public void run() {
		synchronized (lock) {
			if (availableSeats > 0) {
				System.out.println(Thread.currentThread().getName() + " booked 1 ticket");

				availableSeats--;
				// Thread.sleep(5000);

			} else {
				System.out.println(Thread.currentThread().getName() + " -> Sorry, no tickets left");
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			TicketBooking t = new TicketBooking();
			t.setName("User-" + i);
			t.start();
		}
	}
}
