package CarInventorySystem;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }


    public void getInfo() {
        System.out.println("The vehicle is a " + getMake() + " " + getModel() + " with VIN number: " + getVinNumber() + " at " + getMileage() + "km " + "and has four wheel drive " + fourWheelDrive);
    }

        boolean isFourWheelDrive () {
            return fourWheelDrive;
        }

        public void setFourWheelDrive ( boolean fourWheelDrive){
            this.fourWheelDrive = fourWheelDrive;
        }
}