package com.InventoryCarSystem;

import com.InventoryCarSystem.Car;

public class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage;
    }
}