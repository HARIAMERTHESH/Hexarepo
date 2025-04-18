package com.bookingapp.model;
import java.util.Scanner;

public class TicketBookingApp {


	public class TicketBookingSystem {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        
	        System.out.print("Enter number of available tickets: ");
	        int availableTickets = sc.nextInt();
	        
	        System.out.print("Enter number of tickets you want to book: ");
	        int noOfBookingTickets = sc.nextInt();
	        
	        
	        if (availableTickets >= noOfBookingTickets) {
	           
	            int remainingTickets = availableTickets - noOfBookingTickets;
	            System.out.println("Booking successful!");
	            System.out.println("Remaining tickets: " + remainingTickets);
	        } else {
	         
	            System.out.println("Tickets unavailable!");
	            System.out.println("Available tickets: " + availableTickets + 
	                             ", but requested: " + noOfBookingTickets);
	        }
	        
	        sc.close();
	    }
	}

}
