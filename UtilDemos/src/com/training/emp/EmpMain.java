package com.training.emp;

import java.util.ArrayList;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Hari", 101, "Chennai", 50000);
        Employee e2 = new Employee("Raj", 102, "Bangalore", 55000);
        
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }
}
		
