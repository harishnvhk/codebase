package com.siva;
import java.util.ArrayList;
import java.util.Collections;

import com.harish.Employee;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Kiran");
        names.add("Anu");
        names.add("Bhavya");

        System.out.println("Before sorting: " + names);

        Collections.sort(names);
        Collections.reverse(names);
        // sorts in natural (ascending) order

        System.out.println("After sorting: " + names);
        
        
        
        Employee e1 = new Employee(1,"Harish",1000);
    }
}
