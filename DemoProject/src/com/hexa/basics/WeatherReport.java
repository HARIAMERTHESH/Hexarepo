package com.hexa.basics;

public class WeatherReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String choice = "Rainy";  

		        switch (choice.toUpperCase()) {
		            case "RAINY":
		                System.out.println("Drink hot tea");
		                break;
		            case "SUMMER":
		                System.out.println("Eat ice cream");
		                break;
		            case "WINTER":
		                System.out.println("Drink soup 🍲");
		                break;
		            case "SPRING":
		                System.out.println("Enjoy the beauty of flowers");
		                break;
		            default:
		                System.out.println("Wrong choice");
		        }
		    }


}
