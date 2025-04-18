package com.carrental.dao;

import com.carrental.entity.*;
import com.carrental.exception.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CarLeaseRepositoryImp1 implements ICarLeaseRepository {

    private final Map<Integer, Vehicle> carDatabase = new HashMap<>();
    private final Map<Integer, Customer> customerDatabase = new HashMap<>();
    private final Map<Integer, Lease> leaseDatabase = new HashMap<>();
    private final List<Lease> leaseHistory = new ArrayList<>();

    private final AtomicInteger carIdCounter = new AtomicInteger(1);
    private final AtomicInteger customerIdCounter = new AtomicInteger(1);
    private final AtomicInteger leaseIdCounter = new AtomicInteger(1);

    // ------------------ Car Operations ------------------

    @Override
    public void addCar(Vehicle car) {
        car.setVehicleID(carIdCounter.getAndIncrement());
        carDatabase.put(car.getVehicleID(), car);
    }

    @Override
    public void removeCar(int carID) throws CarNotFoundException {
        if (!carDatabase.containsKey(carID)) {
            throw new CarNotFoundException("Car ID not found: " + carID);
        }
        carDatabase.remove(carID);
    }

    @Override
    public List<Vehicle> listAvailableCars() {
        return carDatabase.values().stream()
                .filter(car -> "available".equalsIgnoreCase(car.getStatus()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> listRentedCars() {
        return carDatabase.values().stream()
                .filter(car -> "rented".equalsIgnoreCase(car.getStatus()))
                .collect(Collectors.toList());
    }

    @Override
    public Vehicle findCarById(int carID) throws CarNotFoundException {
        Vehicle car = carDatabase.get(carID);
        if (car == null) {
            throw new CarNotFoundException("Car not found with ID: " + carID);
        }
        return car;
    }

    // ------------------ Customer Operations ------------------

    @Override
    public void addCustomer(Customer customer) {
        customer.setCustomerID(customerIdCounter.getAndIncrement());
        customerDatabase.put(customer.getCustomerID(), customer);
    }

    @Override
    public void removeCustomer(int customerID) throws CustomerNotFoundException {
        if (!customerDatabase.containsKey(customerID)) {
            throw new CustomerNotFoundException("Customer ID not found: " + customerID);
        }
        customerDatabase.remove(customerID);
    }

    @Override
    public List<Customer> listCustomers() {
        return new ArrayList<>(customerDatabase.values());
    }

    @Override
    public Customer findCustomerById(int customerID) throws CustomerNotFoundException {
        Customer customer = customerDatabase.get(customerID);
        if (customer == null) {
            throw new CustomerNotFoundException("Customer not found with ID: " + customerID);
        }
        return customer;
    }

    // ------------------ Lease Operations ------------------

    @Override
    public Lease createLease(int customerID, int carID, Date startDate, Date endDate, String type)
            throws CustomerNotFoundException, CarNotFoundException {

        Customer customer = findCustomerById(customerID);
        Vehicle car = findCarById(carID);

        if (!"available".equalsIgnoreCase(car.getStatus())) {
            throw new IllegalStateException("Car is not available for leasing.");
        }

        Lease lease = new Lease();
        lease.setLeaseID(leaseIdCounter.getAndIncrement());
        lease.setCustomerID(customerID);
        lease.setVehicleID(carID);
        lease.setStartDate(startDate);
        lease.setEndDate(endDate);
        lease.setType(type);
        lease.setActive(true);

        leaseDatabase.put(lease.getLeaseID(), lease);
        car.setStatus("rented");

        return lease;
    }

    @Override
    public Lease returnCar(int leaseID) throws LeaseNotFoundException {
        Lease lease = leaseDatabase.get(leaseID);
        if (lease == null) {
            throw new LeaseNotFoundException("Lease not found with ID: " + leaseID);
        }

        lease.setActive(false);

        // Fetch the vehicle and mark it as available
        Vehicle vehicle = carDatabase.get(lease.getVehicleID());
        if (vehicle != null) {
            vehicle.setStatus("available");
        }

        leaseHistory.add(lease);
        leaseDatabase.remove(leaseID);

        return lease;
    }


    @Override
    public List<Lease> listActiveLeases() {
        return new ArrayList<>(leaseDatabase.values());
    }

    @Override
    public List<Lease> listLeaseHistory() {
        return new ArrayList<>(leaseHistory);
    }

    // ------------------ Payment Operation ------------------

    @Override
    public void recordPayment(Lease lease, double amount) throws LeaseNotFoundException {
        if (!leaseDatabase.containsKey(lease.getLeaseID()) && 
            leaseHistory.stream().noneMatch(l -> l.getLeaseID() == lease.getLeaseID())) {
            throw new LeaseNotFoundException("Lease not found.");
        }

        lease.setPaymentAmount(amount);
    }
}

