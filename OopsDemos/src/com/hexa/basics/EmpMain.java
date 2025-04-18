package com.hexa.basics;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("Priya",2000);
		employee.printDetails();
		String result=employee.greet();
		System.out.println(result);
		employee.calcBonus(2000);
		System.out.println();
		
		
		
		Employee employee1 = new Employee("Raju",3000);
		employee1.printDetails();
		result =employee1.greet();
		System.out.println(result);
		employee.calcBonus(2000);;
		
		

	}

	}

