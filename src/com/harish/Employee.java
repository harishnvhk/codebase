package com.harish;

import java.util.*;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private Double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Define natural ordering based on salary
	public int compareTo(Employee e1) {
		return Double.compare(this.salary, e1.salary); // ascending
	}

	/*
	 * public String toString() { return "Printing the values : id "+ id + "Name: "
	 * + name + "Salary :" + salary; }
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
