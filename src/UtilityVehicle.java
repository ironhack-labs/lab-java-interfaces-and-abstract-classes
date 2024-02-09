public class UtilityVehicle extends Car{
    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, int mileage, boolean fourWheelDrive, String model ) {
        super(vinNumber, make, mileage, model);
        this.fourWheelDrive =fourWheelDrive;
    }
    public String getInfo(){
        return "Truck - VIN: " + getVinNumber() + ", Make: " + getMake() + ", Model: " + getModel()+ ", Mileage: " + getMileage() +"Is FourWheelDrive?" + isFourWheelDrive();
    }
}
