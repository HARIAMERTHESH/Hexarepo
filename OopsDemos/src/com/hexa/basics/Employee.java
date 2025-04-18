package com.hexa.basics;

public class Employee {
	String empName;
	double salary;

	public Employee(String empName,double salary){
		this.empName = empName;
		this.salary = salary;
		
		
	}
	void printDetails() {
		System.out.println("name "+empName);
		System.out.println("salary "+salary);
		
	}
	 String greet(){
		 return "Great day"+empName;
		 
	 }
	 
	 void calcBonus(int amount) {
		 System.out.println("Bonus "+salary*2);
	 }

}

