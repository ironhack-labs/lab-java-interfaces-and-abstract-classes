public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    // Constructor
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    // Setter fourWheelDrive
    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    // Getter fourWheelDrive
    public boolean getFourWheelDrive() {
        return fourWheelDrive;
    }
}
