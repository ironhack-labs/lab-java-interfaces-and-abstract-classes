package car.inventory.system;

public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    @Override
    String getInfo() {
        return String.format("Car: %n vinNumber = %s%n make = %s%n model = %s%n mileage = %s%n fourWheelDrive = %s%n",
                super.getVinNumber(), super.getMake(), super.getModel(), super.getMileage(), isFourWheelDrive());
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

}
