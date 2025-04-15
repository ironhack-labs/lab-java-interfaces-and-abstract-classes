package com.ironhack;

public class UtilityVehicle extends Car {

//additional properties
    boolean hasFourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean hasFourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.hasFourWheelDrive = hasFourWheelDrive;
        System.out.println("Utility Vehicle Information :" + toString());
    }
}