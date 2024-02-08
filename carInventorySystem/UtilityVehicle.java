package carInventory;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage) {

        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = hasFourWheelDrive();
    }

    public boolean hasFourWheelDrive(){
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getType() {
        return null;
    }
}
