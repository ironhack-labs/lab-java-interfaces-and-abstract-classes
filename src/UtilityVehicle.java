public class UtilityVehicle extends Car{

    private final boolean fourWheelDrive ;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n fourWheelDrive (Yes/No): " + (fourWheelDrive ? "Yes" : "No");
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }
}
