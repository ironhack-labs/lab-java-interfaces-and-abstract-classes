
public class UtilityVehicle extends Car {

    public UtilityVehicle(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    boolean fourWheelDrive;

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }


}
