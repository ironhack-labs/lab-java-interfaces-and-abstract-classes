package com.ironhack.lab.exercise2;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    //Constructor

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    //Getters de la clase

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Four Wheel Drive: " + fourWheelDrive;
    }
}
