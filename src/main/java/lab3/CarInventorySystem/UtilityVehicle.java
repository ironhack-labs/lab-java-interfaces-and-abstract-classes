package lab3.CarInventorySystem;

public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;

    UtilityVehicle(String vinNumber, String make, String model, String mileage) {
        super(vinNumber, make, model, mileage);
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }
}
