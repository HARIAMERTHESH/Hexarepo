package com.bookingsystem.model;

import java.time.LocalDate;
import java.time.LocalTime;

// Base Event class
public class Event {
    public enum EventType { MOVIE, CONCERT, SPORTS }
    
    protected String eventName;
    protected LocalDate eventDate;
    protected LocalTime eventTime;
    protected String venueName;
    protected int totalSeats;
    protected int availableSeats;
    protected double ticketPrice;
    protected EventType eventType;

    // Constructors, getters, setters...
    public Event() {}

    public Event(String eventName, LocalDate eventDate, LocalTime eventTime, 
                String venueName, int totalSeats, double ticketPrice, EventType eventType) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.venueName = venueName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.ticketPrice = ticketPrice;
        this.eventType = eventType;
    }

    public void displayEventDetails() {
        System.out.println("\n=== Event Details ===");
        System.out.println("Name: " + eventName);
        System.out.println("Date: " + eventDate);
        System.out.println("Time: " + eventTime);
        System.out.println("Venue: " + venueName);
        System.out.println("Available Seats: " + availableSeats + "/" + totalSeats);
        System.out.println("Ticket Price: $" + ticketPrice);
    }

    public boolean bookTickets(int numTickets) {
        if (availableSeats >= numTickets) {
            availableSeats -= numTickets;
            return true;
        }
        return false;
    }

    public void cancelBooking(int numTickets) {
        availableSeats = Math.min(availableSeats + numTickets, totalSeats);
    }
}

// Movie subclass
class Movie extends Event {
    private String genre;
    private String actorName;
    private String actressName;

    public Movie() {
        this.eventType = EventType.MOVIE;
    }

    public Movie(String eventName, LocalDate eventDate, LocalTime eventTime, 
                String venueName, int totalSeats, double ticketPrice,
                String genre, String actorName, String actressName) {
        super(eventName, eventDate, eventTime, venueName, totalSeats, ticketPrice, EventType.MOVIE);
        this.genre = genre;
        this.actorName = actorName;
        this.actressName = actressName;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Type: Movie");
        System.out.println("Genre: " + genre);
        System.out.println("Actor: " + actorName);
        System.out.println("Actress: " + actressName);
    }

    // Getters and setters...
}