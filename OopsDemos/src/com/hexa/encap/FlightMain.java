package com.hexa.encap;

public class FlightMain {
	
	public static void main(String[] args) {
		Flight flight = new Flight();
		flight.setSource("Chennai");
		flight.setAvailableSeats(100);
		flight.setDestination("Banglore");
		flight.setType("Bussiness");
		flight.setNoOfPassengers(100);
		System.out.println(flight);
		//static varaiable to be called in static way
		
		
		double salary=Double.parseDouble("80000");
		System.out.println(salary);
		salary=Double.parseDouble("eighty T");
		System.out.println(salary);
		
		salary=Double.parseDouble("eighty T");
		System.out.println(salary);


	}
}
