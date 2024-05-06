package CarInventorySystem;

public class UtilityVehicle extends Car{
    boolean fourWheelDrive = true ;

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public UtilityVehicle(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    public String getInfo(){
        return "vinNumber:" +getVinNumber() + " Make:" +
                getMake() + " Model:" + getModel() + " Mileage:" +getMileage()
                + " fourWheelDrive: " + isFourWheelDrive();
    }
}
