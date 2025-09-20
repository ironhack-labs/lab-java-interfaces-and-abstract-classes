package org.example;

public class UtilityVehicle extends Car {
//    UtilityVehicle objects should have an additional fourWheelDrive property,
//    a boolean that represents whether the vehicle has four-wheel drive.
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

//    Getter
    public boolean getFourWheelDrive() {
        return fourWheelDrive;
    }

//    Setter
    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

//    Methods


    @Override
    public String getInfo() {
        String carInfo = super.getInfo();
        fourWheelDrive = getFourWheelDrive();
        return carInfo + "\n" + "Four Wheel Drive: " + fourWheelDrive;
    }
}
