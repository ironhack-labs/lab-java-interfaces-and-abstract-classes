package CarInventirySystem;

public class UtilityVehicle extends Car{
    boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getInfo() {
        String carInfo = "The vinNumber is " + vinNumber + ". Make is " + make + ". Model is " + model + ". Mileage is " + mileage +
                " miles.";
        if (fourWheelDrive) {
            return carInfo + " And it has a four wheel drive.";
        } else {
            return carInfo + " It does not have a four wheel drive.";
        }
    }
}
