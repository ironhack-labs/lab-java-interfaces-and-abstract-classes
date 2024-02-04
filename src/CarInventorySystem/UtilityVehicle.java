package CarInventorySystem;

public class UtilityVehicle extends Car {
    // Constructors
    UtilityVehicle(String vinNumber, String model, int mileage, boolean fourWheelDrive){
        super(vinNumber, "UtilityVehicle", model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    // Attributes
    private boolean fourWheelDrive;

    // Getters and Setters
    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    // Methods
    @Override
    public String getInfo() {
        return "{\n"
                + "\t" + "Vin Number: " + getVinNumber() + "\n"
                + "\t" + "Make: " + getMake() + "\n"
                + "\t" + "Model: " + getModel() + "\n"
                + "\t" + "Mileage: " + getMileage() + "\n"
                + "\t" + "Four Wheel Drive: " + isFourWheelDrive() + "\n"
                + "}";
    }
}
