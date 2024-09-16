package CarInventorySystem;

public class UtilityVehicle extends Car{

    boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive=fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getInfo() {
        return "UtilityVehicle{" +
                ", vinNumber='" + getVinNumber() + '\'' +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +'\'' +
                "fourWheelDrive =" + isFourWheelDrive()  +
                '}';
    }

}
