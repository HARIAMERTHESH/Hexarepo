package com.hexa.overriding;

public class TwoWheeler {
	String model;
	String brand;
	double price;
	public TwoWheeler(String model, String brand, double price) {
		super();
		this.model=model;
		this.brand=brand;
		this.price=price;
		
	}
	void printDetails() {
		System.out.println("model"+model);
		System.out.println("brand"+brand);
		System.out.println("price "+price);
	}
	void getMileage() {
		System.out.println("Good Mileage :2Km/ltr");
		
	}
	String[] showAccessories() {
		String[] accessories = {"Seat Cover","Gloves"};
		return accessories;
	}
	
}