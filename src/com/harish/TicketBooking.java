package com.harish;

class TicketBooking extends Thread {
	static int availableSeats = 5;

	public void run() {
		if (availableSeats > 0) {
			System.out.println(Thread.currentThread().getName() + " booked 1 ticket");
			availableSeats--;
		} else {
			System.out.println(Thread.currentThread().getName() + " -> Sorry, no tickets left");
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
