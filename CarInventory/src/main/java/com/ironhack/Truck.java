package com.ironhack;

public class Truck extends Car {

    //Additional properties
    private double towingCapacity;

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;


        System.out.println("Truck Information :" + toString());
    }
}
