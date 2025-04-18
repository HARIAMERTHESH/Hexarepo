package com.bookingapp.entity;

public class Booking {
	Event event;
	double totalBookingCost;
	int numTickets;
	 	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Event event) {
		super();
		this.event = event;
	}

	public void calculateBookingCost(int numTickets) {
		this.numTickets = numTickets;
        this.totalBookingCost = numTickets * event.getTicketPrice();
        System.out.println("Booking Cost: Rs. " + totalBookingCost);
	}
	
	public void bookTickets(int numTickets) {
		event.bookTickets(numTickets);
	}
	
	public void cancelBooking(int numTickets) {
		event.cancelBooking(numTickets);
	}
	
	public int getAvailableNoOfTickets() {
		return event.getAvailableSeats();
	}
	
	public void getEventDetails() {
		event.displayEventDetails();
	}
}