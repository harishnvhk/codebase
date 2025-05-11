package com.harish;

public class Child extends Parent {

	public int c = 10;

	public Child(int a, int b) {

		super(a, b);
		c = 20;
		// TODO Auto-generated constructor stub
	}

	public Child() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void StudentId(String name, int roll_no) {
		System.out.println("Name: " + name + " " + "Roll-No: " + roll_no);
	}

	@Override
	public void StudentId(int roll_no, String name) {
		// Again printing name and id of person
		System.out.println("Harish Roll-No: " + roll_no + " " + "Name: " + name);
	}

	public void additionalMethod() {

	}

}