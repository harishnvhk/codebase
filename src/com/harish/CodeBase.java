package com.harish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class CodeBase {
	public static void main(String[] args) {
		
		int inta= 10;
		int intb= 10;
		
		System.out.println(inta==intb);
		
		//String Constant Pool String Interning
		String a= "Siva";
		String b= "Siva";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String a1= new String("Siva");
		String b1= new String("Siva");
		
		System.out.println(a1==b1);
		System.out.println(a1.equals(b1));

		// List of String
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Ravi");
		stringList.add("Kiran");
		stringList.add("Anu");
		stringList.add("Bhavya");

		Iterator<String> itr = stringList.iterator();

		while (itr.hasNext()) {
			String names = itr.next();
			System.out.println(names);
		}

		/* The below code will not work because list.iterator 
		 * will return iterator every time
		while (stringList.iterator().hasNext()) {
			String names = stringList.iterator().next();
			System.out.println(names);
		}
        */
		System.out.println("Before sorting: " + stringList);

		// sorts in natural (ascending) order
		Collections.sort(stringList);
		System.out.println("After sorting: " + stringList);

		// Reversing the string
		Collections.reverse(stringList);
		System.out.println("After reverse sorting: " + stringList);

		System.out.println("***********************************************");
		// Employee Class
		Employee e1 = new Employee(1, "Harish", 1000);
		Employee e2 = new Employee(2, "Harish2", 20000);
		ArrayList<Employee> employeesList = new ArrayList<Employee>();

		// e1.id= 5;
		e1.setId(5);
		e2.setId(10);
		employeesList.add(e1);
		employeesList.add(e2);
		System.out.println(employeesList);

		Iterator<Employee> empitr = employeesList.iterator();

		System.out.println("Iterator Output");
		while (empitr.hasNext()) {
			Employee e = empitr.next();
			System.out.println(e);
		}
		
		
		Collections.sort(employeesList);

		// Sorting using the Comparator
		Collections.sort(employeesList, new Comparator<Employee>() {

			// override compare method
			public int compare(Employee e1, Employee e2) {
				// return Double.compare(e1.salary, e2.salary);
				return e1.getName().compareTo(e2.getName());
				// return e1.id - e2.id;
			}
		});
		// System.out.println(employeesList);

		Collections.sort(employeesList, new Comparator<Employee>() {

			// override compare method
			public int compare(Employee e1, Employee e2) {
				// return Double.compare(e2.salary, e1.salary);
				return e2.getName().compareTo(e1.getName());
				// return e1.id - e2.id;
			}
		});
		// System.out.println(employeesList);
	}
}
