package com.hexa.basics;

public class SwitchDemo {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		String choice ="diff";
		switch (choice.toUpperCase()) {
		case"ADDITION":
		       System.out.println("Sum "+ (x +y ));
		       break;
		case "PRODUCT":
		       System.out.println("Product "+ (x * y));
		       break;
		case "DIFFERENCE":
	           System.out.println("Product "+ (x - y));
	           break;
	    default:
		       System.out.println("Wrong Choice");  
		}
	}

}
