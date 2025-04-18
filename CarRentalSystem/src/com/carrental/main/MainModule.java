package com.carrental.main;

import com.carrental.dao.*;
import com.carrental.entity.*;
import com.carrental.exception.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class MainModule {
	private static ICarLeaseRepository repository = new CarLeaseRepositoryImp1();
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nCar Rental System");
            System.out.println("1. Car Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Lease Management");
            System.out.println("4. Payment Handling");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            try {
                switch (choice) {
                    case 1: carManagementMenu(); break;
                    case 2: customerManagementMenu(); break;
                    case 3: leaseManagementMenu(); break;
                    case 4: paymentManagementMenu(); break;
                    case 5: running = false; break;
                    default: System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        DBConnection.closeConnection();
    }
    
    private static void carManagementMenu() {

    }
    
}

