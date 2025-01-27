package io.rental;

public class Car {
    private final String make;
    private final String model;
    private final String registrationNumber;

    private String rentalGroup;
    private double costPerDay;

    public Car(String make, String model, String registrationNumber, double costPerDay) {
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.costPerDay = costPerDay;
    }
}
