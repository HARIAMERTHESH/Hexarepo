package com.hexa.basics;

public class Student {
	 String studentname;
	 String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.studentname="Hari";
		student.city="Chennai";
		System.out.println("Studentname : "+student.studentname);
		System.out.println("City :"+student.city);
		
		Student student1 =new Student();
		student1.studentname ="Vimal";
		student1.city="Nagercoil";
		System.out.println("Studentname :"+student1.studentname);
		System.out.println("City :"+student1.city);

	}

}
