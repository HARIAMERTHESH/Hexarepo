package com.bookingapp.entity;

import java.time.LocalDate;
import java.time.LocalTime;

enum EventType {
	Movie, Sports, Concert
}

public class Event {
	String eventName;
    LocalDate eventDate;
    LocalTime eventTime;
    String venueName;
    int totalSeats;
    int availableSeats;
    double ticketPrice;
    EventType eventType;
    
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Event(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName, int totalSeats, int availableSeats,
			double ticketPrice, EventType eventType) {
		super();
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
		this.venueName = venueName;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.ticketPrice = ticketPrice;
		this.eventType = eventType;
	}

	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public LocalTime getEventTime() {
		return eventTime;
	}
	public void setEventTime(LocalTime eventTime) {
		this.eventTime = eventTime;
	}

	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public double calculateTotalRevenue() {
		int bookedTickets = totalSeats - availableSeats;
        double totalRevenue = bookedTickets * ticketPrice;
        return totalRevenue;
    }
    
    public int getBookedNoOfTickets() {
    	int bookedSeats = totalSeats - availableSeats;
        System.out.println("Booked Number Of Seats: ");
        return bookedSeats;
    }
    
    public void bookTickets(int numTickets) {
    	if (numTickets <= availableSeats) {
            availableSeats -= numTickets;
            System.out.println(numTickets + " Tickets Booked Successfully!!");
        } else {
            System.out.println("No Tickets Available!!");
        }
    }
    
    public void cancelBooking(int numTickets) {
    	if (availableSeats + numTickets <= totalSeats) {
            availableSeats += numTickets;
            System.out.println(numTickets + " Tickets Cancelled Successfully!!");
        } else {
            System.out.println("Unable to Cancel Tickets!!");
        }
    }
    
    public void displayEventDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Time: " + eventTime);
        System.out.println("Event Venue: " + venueName);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Event Type: " + eventType);
    }
}