class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    // Constructor
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    // Override getInfo() method
    @Override
    public String getInfo() {
        return "Utility Vehicle: VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage + ", Four-Wheel Drive: " + fourWheelDrive;
    }
}
