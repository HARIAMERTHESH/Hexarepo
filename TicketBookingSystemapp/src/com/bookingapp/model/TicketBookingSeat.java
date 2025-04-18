package com.bookingapp.model;
import java.util.Scanner;

public class TicketBookingSeat {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        final double SILVER_PRICE = 100.0;
	        final double GOLD_PRICE = 200.0;
	        final double DIAMOND_PRICE = 350.0;
	        
	        String userInput;
	        
	        do {
	           
	            System.out.println("\nTicket Categories Available:");
	            System.out.println("1. Silver - Rs." + SILVER_PRICE);
	            System.out.println("2. Gold - Rs." + GOLD_PRICE);
	            System.out.println("3. Diamond - Rs." + DIAMOND_PRICE);
	            System.out.println("Type 'exit' to quit");
	            
	           
	            System.out.print("\nEnter ticket category (1-3) or 'exit': ");
	            userInput = scanner.next();
	            
	           
	            if (userInput.equalsIgnoreCase("exit")) {
	                break;
	            }
	            
	            try {
	                int categoryChoice = Integer.parseInt(userInput);
	                
	               
	                if (categoryChoice < 1 || categoryChoice > 3) {
	                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
	                    continue;
	                }
	                
	               
	                System.out.print("Enter number of tickets needed: ");
	                int numberOfTickets = scanner.nextInt();
	                
	                
	                if (numberOfTickets <= 0) {
	                    System.out.println("Number of tickets must be positive!");
	                    continue;
	                }
	                
	                double ticketPrice = 0;
	                String categoryName = "";
	                
	                
	                switch (categoryChoice) {
	                    case 1:
	                        categoryName = "Silver";
	                        ticketPrice = SILVER_PRICE;
	                        break;
	                    case 2:
	                        categoryName = "Gold";
	                        ticketPrice = GOLD_PRICE;
	                        break;
	                    case 3:
	                        categoryName = "Diamond";
	                        ticketPrice = DIAMOND_PRICE;
	                        break;
	                }
	                
	               
	                double totalCost = ticketPrice * numberOfTickets;
	                
	               
	                System.out.println("\nBooking Details:");
	                System.out.println("Category: " + categoryName);
	                System.out.println("Price per ticket: Rs." + ticketPrice);
	                System.out.println("Number of tickets: " + numberOfTickets);
	                System.out.println("Total cost: Rs." + totalCost);
	                
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input! Please enter a number (1-3) or 'exit'.");
	                scanner.nextLine(); 
	            }
	            
	            
	            scanner.nextLine();
	            
	        } while (true); 
	        
	        System.out.println("\nThank you for using our Ticket Booking System!");
	        scanner.close();
	    }
	}


