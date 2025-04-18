package com.carrental.dao;

import com.carrental.entity.*;
import com.carrental.exception.*;
import java.util.List;
import java.util.Date;

public interface ICarLeaseRepository {
	
    void addCar(Vehicle car);
    void removeCar(int carID) throws CarNotFoundException;
    List<Vehicle> listAvailableCars();
    List<Vehicle> listRentedCars();
    Vehicle findCarById(int carID) throws CarNotFoundException;
    
    void addCustomer(Customer customer);
    void removeCustomer(int customerID) throws CustomerNotFoundException;
    List<Customer> listCustomers();
    Customer findCustomerById(int customerID) throws CustomerNotFoundException;
    
    Lease createLease(int customerID, int carID, Date startDate, Date endDate, String type) 
        throws CustomerNotFoundException, CarNotFoundException;
    Lease returnCar(int leaseID) throws LeaseNotFoundException;
    List<Lease> listActiveLeases();
    List<Lease> listLeaseHistory();
    
    void recordPayment(Lease lease, double amount) throws LeaseNotFoundException;

}
