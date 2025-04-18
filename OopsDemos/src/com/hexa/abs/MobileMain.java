package com.hexa.abs;

public class MobileMain {
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile("S6","Samsung",60000);
		mobile.printDetails();
		mobile.showFeatures();
		String[] accessories= mobile.showAccessories();
		for(String accessory : accessories) {
			System.out.println(accessory);
			
		}
		mobile = new BasicPhone("N123","Nokia",1200);
		mobile.printDetails();
		mobile.showFeatures();
		accessories = mobile.showAccessories();
		for(String accessory : accessories) {
			System.out.println(accessory);
		}
		
	}

}
