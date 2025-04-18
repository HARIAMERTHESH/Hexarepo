package com.hexa.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler Wheeler = new Bike("RX","Bajaj",90000);
		Wheeler.printDetails();
		Wheeler.getMileage();
		
		String[] accessories=Wheeler.showAccessories();
		for(String accessory:accessories)
			System.out.println(accessory);

	}

}
