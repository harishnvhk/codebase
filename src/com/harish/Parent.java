package com.harish;

public class Parent {

	// Method 1

	public int p;

	public Parent(int a, int b) {
		p = 20;
	}

	public Parent() {
		p = 20;
	}

	public void StudentId(String name, int roll_no) {
		System.out.println("Name: " + name + " " + "Roll-No: " + roll_no);
	}

	// Method 2
	public void StudentIdDiff(int roll_no, String name) {
		// Again printing name and id of person
		System.out.println("Roll-No: " + roll_no + " " + "Name: " + name);
	}

	public void StudentId(int roll_no, String name) {
		// Again printing name and id of person
		System.out.println("Harish Roll-No: " + roll_no + " " + "Name: " + name);
	}
}