package com.InventoryCarSystem;

public class Truck extends Car {
    private double towingCapacity = 1000;

    public Truck(String vinNumber, String make, String model, int mileage){
        super(vinNumber, make, model, mileage);
    }


    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +  "\n" + "Towing Capacity : " + getTowingCapacity() ;
    }
}
