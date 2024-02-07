public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    // Constructor
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    // Setter fourWheelDrive
    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    // Getter fourWheelDrive
    public boolean getFourWheelDrive() {
        return fourWheelDrive;
    }

    // Method that returns a String containing all car's properties
    public String getInfo() {
        return "The properties of the utility vehicle are: \n VIN Number: " + super.getVinNumber() + "\n Make:  " + super.getMake() + "\n Model:  " + super.getModel() + "\n Mileage:  " + super.getMileage() + "\n Four wheel drive: " + fourWheelDrive;
    }
}
