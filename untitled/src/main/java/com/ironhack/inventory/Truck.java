package com.ironhack.inventory;

public class Truck extends Car {
    private double towingCapacity;


    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", TOWING CAPACITY: " + towingCapacity;

    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
