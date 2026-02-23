package org.example;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int milage, boolean fourWheelDrive){
        super(vinNumber, make, model, milage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo(){
        return "vinNumber: " + vinNumber + "\nmake: " + make + "\nmodel: " + model + "\nmilage: " + milage + "\nfour wheel drive: " + fourWheelDrive;
    }
}
