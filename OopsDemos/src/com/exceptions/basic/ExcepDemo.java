package com.exceptions.basic;

public class ExcepDemo {
	public static void main(String[] args) {
		try {
			int x =Integer.parseInt("100");
			System.out.println(x);
			int y=1000/x;
			System.out.println(y);
			int[] marks = null;
			System.out.println(marks[0]);
		} catch(ArithmeticException e) {
			System.out.println("Dont enter 0:");
			System.out.println("e.getMessaage()");
		}
		System.out.println("Continue with the program");
	}

}
