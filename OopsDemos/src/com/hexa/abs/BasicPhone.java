package com.hexa.abs;

public class BasicPhone extends Mobile {
	
	public BasicPhone(String model, String brand, double price) {
		super(model, brand, price);
		
	}
	
	@Override
	void showFeatures() {
		System.out.println("Good Camera,Great Bass sound");
	}
	
	@Override
	String[] showAccessories() {
		return null;
	}

}
