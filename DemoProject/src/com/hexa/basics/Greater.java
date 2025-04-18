package com.hexa.basics;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		int num2=30;
		int num3=40;
		if (num1 > num2 && num1>num3) {
            System.out.println("Greatest number is: " + num1);
        } else if (num2 >num3) {
            System.out.println("Greatest number is: " + num2);
        } else {
            System.out.println("Greatest number is: " + num3);
        }


	}

}
