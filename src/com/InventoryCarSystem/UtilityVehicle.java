package com.InventoryCarSystem;

import com.BigDecimalOperations.Car;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive = false;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage){
        super(vinNumber, make, model, mileage);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" + "4x4 : " + (isFourWheelDrive() ? "Yes" : "No");
    }
}
