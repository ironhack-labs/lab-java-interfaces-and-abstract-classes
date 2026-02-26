package com.ironhack.CarInventorySystem;

public class Truck extends Car{

    private double towingCapacity;


    public Truck(String vinNumber, String make, String model, int mileage,double towingCapacity){
        super(vinNumber,make,model,mileage);
        setTowingCapacity(towingCapacity);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity < 0) {
            System.err.println("towingCapacity cannot be negative");
        }
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+", towingCapacity: " + towingCapacity;

    }
}
