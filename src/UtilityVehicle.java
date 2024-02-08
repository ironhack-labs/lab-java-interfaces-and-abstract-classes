public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;


    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }
    //Getter
    public String isFourWheelDrive() {
        if (fourWheelDrive) {
            return "YES";
        } else {
            return "NO";
        }
    }
    //Setter
    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getInfo(){
        return "This is a UtilityVehicle, and the Vin Number is: " + getVinNumber() + ", Make by: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + ", has four-wheel drive: " + isFourWheelDrive();
    }
}
