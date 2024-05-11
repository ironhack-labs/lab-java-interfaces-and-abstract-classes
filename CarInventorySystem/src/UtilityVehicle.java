//UtilityVehicle objects should have an additional fourWheelDrive property,
// a boolean that represents whether the vehicle has four-wheel drive.
public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;


    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.fourWheelDrive = fourWheelDrive;
    }


    @Override
    public String toString() {
        return "Type: Truck, VIN: " + vinNumber +
                ", Make: " + make +
                ", Model: " + model +
                ", Mileage: " + mileage +
                ", Four Wheel Drive: " + fourWheelDrive;
    }
}