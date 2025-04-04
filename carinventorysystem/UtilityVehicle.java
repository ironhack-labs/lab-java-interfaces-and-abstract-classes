package carinventorysystem;

public class UtilityVehicle extends Car {
    boolean fourWheelDrive;

    public UtilityVehicle(boolean fourWheelDrive, String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getInfo() {
        return super.getInfo() + "\nFour wheel drive: " + fourWheelDrive;
    }
}
