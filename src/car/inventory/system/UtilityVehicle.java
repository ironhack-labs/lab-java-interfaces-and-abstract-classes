package car.inventory.system;

public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    @Override
    String getInfo() {
        return "Car: " + "\n" +
                "vinNumber='" + super.getVinNumber() + "\n" +
                "make='" + super.getMake() + "\n" +
                "model='" + super.getModel() + "\n" +
                "mileage=" + super.getMileage() + "\n" +
                "fourWheelDrive=" + isFourWheelDrive()+ "\n";
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

}
