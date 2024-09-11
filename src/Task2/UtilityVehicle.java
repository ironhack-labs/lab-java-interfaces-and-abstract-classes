package Task2;

public class UtilityVehicle extends Car {

    private boolean hasFourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileAge, boolean hasFourWheelDrive) {
        super(vinNumber, make, model, mileAge);
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    public boolean isHasFourWheelDrive() {
        return hasFourWheelDrive;
    }

    public void setHasFourWheelDrive(boolean hasFourWheelDrive) {
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    public void displayInformation() {
        System.out.println("Four wheel drive: " + (hasFourWheelDrive ? "Yes" : "No"));
    }


    @Override
    public String getInfo() {
        return  "VIN Number: " + getVinNumber() + ", " +
                "Make: " + getMake() + ", " +
                "Model: " + getModel() + ", " +
                "Mileage: " + getMileAge()+ "Four Wheel Drive: "+(hasFourWheelDrive ? "Yes":"No");
    }
}
