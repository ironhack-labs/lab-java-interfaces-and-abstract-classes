package com.ironhack.inventory;

public class UtilityVehicle extends Car{
    boolean fourWheelDrive ;

    public UtilityVehicle(String make, int milleage, String model, String vinNumber, boolean fourWheelDrive) {
        super(make, milleage, model, vinNumber);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo(){
        String info = "This car's vinnumber is: " + this.vinNumber + " make is : " + this.make +
                " mode is : " + this.model + " millage equals to + " + this.milleage
                + " is it fourwheel drive ? " + this.fourWheelDrive;
        return info;
    }
}
