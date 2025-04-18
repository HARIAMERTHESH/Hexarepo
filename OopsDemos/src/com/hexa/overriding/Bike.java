package com.hexa.overriding;

public class Bike extends TwoWheeler{
	
	public Bike(String model, String brand, double price) {
		super(model,brand,price);
		
	}
	@Override
	void getMileage() {
		System.out.println("Okish");
	}
	@Override
	String[] showAccessories() {
//	String[] accessories = {"Seat Cover","Helmet","DashCam"};
	//return accessories;
	return new String[] {"Seat Cover","Helmet","DashCam"};

	
				
		}
	}

