public class UtilityVehicle extends Car {
    private boolean fourWheelDrive; // Class field

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive; // Initialize from parameter
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }


    @Override
    public String toString() {

        String stringOriginal = super.toString();
        return "Utility vehicle, " + stringOriginal + ", Has four wheel drive: " + fourWheelDrive;

    }


    @Override
    public String getInfo() {
        String stringGetinfo = super.toString();
        return  "Utility vehicle: " + stringGetinfo;
    }

}