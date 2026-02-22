package com.ironhack;

public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity){
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }
    @Override
    public String getInfo(){
        return "VIN Number: " + this.vinNumber + " | Make: " + this.make + " | Model: " + this.model + " | Mileage: " + this.mileage + " | Towing Capacity: " + this.towingCapacity + "\n";
    }
}
