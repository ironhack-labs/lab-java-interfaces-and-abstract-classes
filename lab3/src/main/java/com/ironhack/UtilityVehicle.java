package com.ironhack;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive){
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }
    @Override
    public String getInfo(){
        return "VIN Number: " + this.vinNumber + " | Make: " + this.make + " | Model: " + this.model + " | Mileage: " + this.mileage + " | Is Four Wheel?: " + this.fourWheelDrive + "\n";
    }

}
