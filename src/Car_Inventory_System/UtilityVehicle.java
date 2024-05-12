package Car_Inventory_System;

public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }
    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}
