package com.training.emp;

public class Employee {

	    private String employeeName;
	    private int empId;
	    private String city;
	    private int salary;

	
	    public Employee() {}

	  
	    public Employee(String employeeName, int empId, String city, int salary) {
	        this.employeeName = employeeName;
	        this.empId = empId;
	        this.city = city;
	        this.salary = salary;
	    }

	    public String getEmployeeName() {
	        return employeeName;
	    }

	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public void setEmpId(int empId) {
	        this.empId = empId;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	    public String toString() {
	        return "Name=" + employeeName + ", ID=" + empId + ", city=" + city + ", salary=" + salary ;
	    }
	}

	


