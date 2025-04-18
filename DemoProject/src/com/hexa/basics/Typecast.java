package com.hexa.basics;

public class Typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=100;
		int x = b*2;
		long y = x+1000;
		double val = y*3;
		System.out.println(y);
//      downcasting		
		// ctrl d is for the delete line
		double num =86.25;
		System.out.println(num);
		long num1=(long)num; //downcasting
		int num2=(int)num1*3;
		System.out.println(num2);
		
		float a =1.2f;
		// convert  double to float
		num =100.25;
		float num6 =(float)num; //downcasting
		System.out.println(num6);

	}

}
