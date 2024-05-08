public class UtilityVehicle extends Car {

    //Attributes
    private boolean fourWheelDrive;

    //constructor
    public UtilityVehicle(String make, String model, int mileage,int vinNumber, boolean fourWheelDrive) {
        super(make,model,mileage, vinNumber);
        this.fourWheelDrive = fourWheelDrive;
    }


    // getters

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }


    public boolean getInfo() {
        System.out.println("VIN Number: " + getVinNumber());
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Mileage: " + getMileage());
        System.out.println("is 4x4: " + isFourWheelDrive() ) ;
        return false;
    }
}
