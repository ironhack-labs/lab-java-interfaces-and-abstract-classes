public class UtilityVehicle extends Car{
private boolean fourWheelDrive = true;

    public UtilityVehicle(String vin, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vin, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}
