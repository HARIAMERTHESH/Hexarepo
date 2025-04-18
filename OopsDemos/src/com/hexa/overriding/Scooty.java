package com.hexa.overriding;

public class Scooty extends TwoWheeler{
	 public Scooty(String model, String brand, double price) {
		 super(model,brand,price);
		 
	 }
	 @Override
	 void getMileage() {
		 System.out.println("Rayzr");
	 }
     @Override
     String[] showAccessories() {
    	 //String[] accessories = {"Seat Cover","Helmet","DashCam"};
    	// String[] accessories;
    	 return new String[] {"Seat Cover","Helmet","DashCam"};
    	 
     }
}
