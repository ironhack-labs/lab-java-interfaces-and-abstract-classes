package com.ironhack.lab.exercise2;

public class Truck extends Car {
    private double towingCapacity;

    //Constructor

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    //Getters de la clase
    public double getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Towing Capacity: " + towingCapacity;
    }
}
