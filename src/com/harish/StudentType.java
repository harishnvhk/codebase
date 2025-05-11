package com.harish;

import java.util.Scanner;

public class StudentType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose your student type:");
		System.out.println("1. Full-Time Student");
		System.out.println("2. Part-Time Student");
		System.out.print("Enter 1 or 2: ");

		String choice = sc.nextLine();

		if (choice.equals("full time student")) {
			System.out.println("You selected: Full-Time Student");
		} /*
			 * else if (choice == 2) {
			 * System.out.println("You selected: Part-Time Student"); }
			 */else {
			System.out.println("Invalid choice. Please enter 1 or 2.");
		}

		sc.close();
	}
}
