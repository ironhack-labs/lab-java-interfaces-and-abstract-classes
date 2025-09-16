package carInventory;

public class UtilityVehicle extends Car{
    boolean fourWheelDrive;

    UtilityVehicle (String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean getFourWheelDrive () {
        return fourWheelDrive;
    }

    public void setFourWheelDrive (boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        if (fourWheelDrive) {
            return "VIN: " + vinNumber + ", make: " + make + ", model: " + model + " 4x4" + ", mileage: " + mileage;
        } else {
            return "VIN: " + vinNumber + ", make: " + make + ", model: " + model + " NO 4x4" + ", mileage: " + mileage;
        }
    }
}
