package CarInventorySystem;

public class UtilityVehicle extends Car{

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive=fourWheelDrive;
    }

    @Override
    String getInfo() {
        return "UtilityVehicle{" +
                "fourWheelDrive=" + fourWheelDrive +
                ", vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
    boolean fourWheelDrive;
}
