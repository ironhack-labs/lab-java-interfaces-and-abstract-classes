public class UtilityVehicule extends Car {


    private Boolean fourWheelDrive;

    public UtilityVehicule(String make, int mileage, String model, Boolean fourWheelDrive) {
        super(make, mileage, model);
        this.fourWheelDrive = fourWheelDrive;
    }

    public Boolean getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(Boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }



}
