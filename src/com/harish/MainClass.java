package com.harish;

class MainClass {

	public static void main(String[] args) {
		Parent obj1 = new Child();

		obj1.p = 40;
		// obj.i= 80;

		obj1.StudentId("Harish", 1);
		obj1.StudentId(2, "Suresh");

		Child obj2 = new Child();
		obj2.c = 20;
		obj2.p = 30;
	}
}