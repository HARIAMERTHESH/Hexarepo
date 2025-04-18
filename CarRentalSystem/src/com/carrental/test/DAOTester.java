package com.carrental.test;

import com.carrental.dao.CarLeaseRepositoryImp1;
import com.carrental.dao.ICarLeaseRepository;
import com.carrental.entity.Vehicle;
import com.carrental.exception.CarNotFoundException;

public class DAOTester {
    public static void main(String[] args) {
    	CarLeaseRepositoryImp1 repo =  new CarLeaseRepositoryImp1();
        
        // Test adding a car
        Vehicle testCar = new Vehicle("Toyota", "Corolla", 2023, 45.00, "available", 5, 1800);
        repo.addCar(testCar);
        System.out.println("Car added with ID: " + testCar.getVehicleID());
        
        // Test finding the car
        try {
            Vehicle found = repo.findCarById(testCar.getVehicleID());
            System.out.println("Found car: " + found.getMake() + " " + found.getModel());
        } catch (CarNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}