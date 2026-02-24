package org.example;

public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int milage, double towingCapacity){
        super(vinNumber, make, model, milage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo(){
        return "vinNumber: " + vinNumber + "\nmake: " + make + "\nmodel: " + model + "\nmilage: " + milage + "\ntowing capacity: " + towingCapacity;
    }
}
