package com.hexa.encap;

public class Flight {

    private int noOfPassengers;
    private String type;
    private String flightName;
    private int availableSeats;
    private String source;
    private String destination;
    

    // Default constructor
    public Flight() {
        super();
    }

    // Setters
    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setAvailableSeats(int seats) {
        this.availableSeats = seats;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    // Getters
    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public String getType() {
        return type;
    }

    public String getFlightName() {
        return flightName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    
    @Override
    public String toString() {
        return "Flight [FlightName=" + flightName + ", Type=" + type + ", NoOfPassengers=" + noOfPassengers +
                ", AvailableSeats=" + availableSeats + ", Source=" + source + ", Destination=" + destination + "]";
    }
}
