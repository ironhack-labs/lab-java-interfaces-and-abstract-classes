package Abstract;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean FourWheelDrive() {
        return fourWheelDrive;
    }

    public UtilityVehicle(String VinNumber, String make, String model, int mileage) {
        super(VinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {return "VIN: " + this.getVinNumber() + ", Make: " + this.getMake() + ", Model: " + this.getModel() + ", Mileage: " + this.getMileage() + ", Four Wheel Drive: " + this.getfourWheelDrive();
    }
}
