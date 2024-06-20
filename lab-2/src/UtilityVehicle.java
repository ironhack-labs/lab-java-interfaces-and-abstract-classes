
public class UtilityVehicle extends Car{

    private boolean fourWheelDrive = true;
    public UtilityVehicle(String make, String vinNumber, String model, int mileage , boolean fourWheelDrive) {
        super();
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public void close() {

    }
}