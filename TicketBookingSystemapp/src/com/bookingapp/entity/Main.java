package com.bookingapp.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		Event event = new Event("Summer Concert", LocalDate.of(2025, 5, 10),  LocalTime.of(14, 30), 
                "jimbda Arena", 200, 200, 500.0, EventType.Concert);
		event.displayEventDetails();
        event.bookTickets(10);
        event.cancelBooking(3);
        event.displayEventDetails();
		double totalRevenue = event.calculateTotalRevenue();
        System.out.println("Total Revenue: Rs. " + totalRevenue);
        
        Venue venue1 = new Venue();
        venue1.setVenueName("Default Hall");
        venue1.setAddress("123 Main Street");
        venue1.displayVenueDetails();

        
        Venue venue2 = new Venue("Grand Theater", "456 Broadway");
        venue2.displayVenueDetails();
        
        Customer customer1 = new Customer();
        customer1.setCustomerName("John Doe");
        customer1.setEmail("john.doe@example.com");
        customer1.setPhoneNumber("1234567890");
        customer1.displayCustomerDetails();

        // Create customer using parameterized constructor
        Customer customer2 = new Customer("Jane Smith", "jane.smith@example.com", "9876543210");
        customer2.displayCustomerDetails();

        // Example with validation
        try {
            Customer customer3 = new Customer();
            customer3.setCustomerName("Test User");
            customer3.setEmail("invalid-email"); // This will throw exception
            customer3.setPhoneNumber("123");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        Booking booking = new Booking(event);
        booking.getEventDetails();
        booking.calculateBookingCost(10);
        booking.bookTickets(3);
        booking.cancelBooking(1);
        booking.getEventDetails();

        
        
        
	}
}