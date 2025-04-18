package com.bookingapp.entity;

public class Customer {
   
    private String customerName;
    private String email;
    private String phoneNumber;

    
    public Customer() {
        
    }

   
    public Customer(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

   
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        
        if (phoneNumber != null && phoneNumber.matches("\\d{10}")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Phone number must be 10 digits");
        }
    }

    
    public void displayCustomerDetails() {
        System.out.println("\n=== Customer Details ===");
        System.out.println("Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }
}
