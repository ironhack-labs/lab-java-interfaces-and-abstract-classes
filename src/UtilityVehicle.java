public class UtilityVehicle extends Car{
    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, int mileage, boolean fourWheelDrive ) {
        super(vinNumber, make, mileage);
        this.fourWheelDrive =fourWheelDrive;
    }
    public String getInfo(){
        return "Truck - VIN: " + getVinNumber() + ", Make: " + getMake() + ", Model: " + ", Mileage: " + getMileage() +"Is FourWheelDrive?" + isFourWheelDrive();
    }
}
