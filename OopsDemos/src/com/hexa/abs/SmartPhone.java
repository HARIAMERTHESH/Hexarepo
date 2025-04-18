package com.hexa.abs;

public class SmartPhone extends Mobile {
	
	public SmartPhone(String model, String brand, double price) {
		
		super(model,brand,price);
			
	}
	@Override
	void showFeatures() {
		
	}
	@Override
	String[] showAccessories() {
		return null;
	}

}
