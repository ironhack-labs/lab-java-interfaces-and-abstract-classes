package Task2;

public class UtilityVehicle extends Car{

    public boolean fourWheelDrive;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "These are the properties of Utility Vehicle: " + this.vinNumber + this.make + this.model + this.mileage + this.fourWheelDrive;
    }
}
