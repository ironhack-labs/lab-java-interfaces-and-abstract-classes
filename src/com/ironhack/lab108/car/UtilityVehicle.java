package com.ironhack.lab108.car;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public void getInfo() {
        System.out.println("------------- Car Information -------------" +
                "\nVin Number       : " + getVinNumber() +
                "\nMake             : " + getMake() +
                "\nModel            : " + getModel() +
                "\nMileage          : " + getMileage() +
                "\nFour Wheel Drive : " + fourWheelDrive);
    }
}
