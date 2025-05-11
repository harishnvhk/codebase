package com.harish;

class Table {

	int a;
	void print() {
		System.out.println("Table class");
	}
}

class CoffeeTable extends Table
{
	void print() {
		System.out.println("Coffee class");
	}
}

public class TestMe {

	public static void main(String[] args) {
		
		Table t = new Table();
		t.print();
		
		
		Table x = t;
		
		x.print();
		t = new CoffeeTable();
		t.print();

	}

}
