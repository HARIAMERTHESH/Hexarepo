package com.bookingapp.entity;

public class Venue {
    
    private String venueName;
    private String address;

    
    public Venue() {
      
    }

   
    public Venue(String venueName, String address) {
        this.venueName = venueName;
        this.address = address;
    }

   
    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
    public void displayVenueDetails() {
        System.out.println("\n=== Venue Details ===");
        System.out.println("Venue Name: " + venueName);
        System.out.println("Address: " + address);
    }

    
    public static void main(String[] args) {
        
        Venue venue1 = new Venue();
        venue1.setVenueName("Default Hall");
        venue1.setAddress("123 Main Street");
        venue1.displayVenueDetails();

        
        Venue venue2 = new Venue("Grand Theater", "456 Broadway");
        venue2.displayVenueDetails();
    }
}