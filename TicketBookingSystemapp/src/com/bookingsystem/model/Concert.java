package com.bookingsystem.model;

public class Concert extends Event {
	
	    private String artist;
	    private String type; // Theatrical, Classical, Rock, Recital

	    public Concert() {
	        this.eventType = EventType.CONCERT;
	    }

	    public Concert(String eventName, LocalDate eventDate, LocalTime eventTime,
	                 String venueName, int totalSeats, double ticketPrice,
	                 String artist, String type) {
	        super(eventName, eventDate, eventTime, venueName, totalSeats, ticketPrice, EventType.CONCERT);
	        this.artist = artist;
	        this.type = type;
	    }

	    @Override
	    public void displayEventDetails() {
	        super.displayEventDetails();
	        System.out.println("Type: Concert");
	        System.out.println("Artist: " + artist);
	        System.out.println("Concert Type: " + type);
	    }
}

	    // Getters and setters...
	
