package Task2;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "UtilityVehicle: VIN=" + vinNumber + ", Make=" + make + ", Model=" + model + ", Mileage=" + mileage
                + ", 4WD=" + fourWheelDrive;
    }

    @Override
    public void startEngine() {
        System.out.println("UtilityVehicle engine started.");
    }

    @Override
    public void drive(int distance) {
        mileage += distance;
        System.out.println("UtilityVehicle drove " + distance + " km. Total mileage: " + mileage);
    }
}