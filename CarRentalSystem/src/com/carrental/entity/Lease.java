package com.carrental.entity;

import java.util.Date;

public class Lease {
    private int leaseID;
    private int vehicleID;
    private int customerID;
    private Date startDate;
    private Date endDate;
    private String type;
    private boolean Status;
    private double paymentAmount;
    
    // Getters and Setters
    public int getLeaseID() { return leaseID; }
    public void setLeaseID(int leaseID) { this.leaseID = leaseID; }
    public int getVehicleID() { return vehicleID; }
    public void setVehicleID(int vehicleID) { this.vehicleID = vehicleID; }
    public int getCustomerID() { return customerID; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }
    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public boolean getActive() {
    	return Status;
    }
    public void setActive(boolean Status) {
    	this.Status=Status;
    }
    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) { this.paymentAmount = paymentAmount; }
}