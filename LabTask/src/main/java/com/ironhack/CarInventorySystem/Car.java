package com.ironhack.CarInventorySystem;

public class Car {

    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getInfo(){
        return "Vin Number: " + vinNumber + "\nMake: " + make + "\nModel: " + model + "\nMileage: " + mileage;
    }
}
