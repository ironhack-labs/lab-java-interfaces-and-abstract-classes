public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;
    public UtilityVehicle (String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {

        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    //SETTERS
    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    //GETTERS
    public boolean getFourWheelDrive() {
        return this.fourWheelDrive;
    }

    //FUNCTIONS
    public String getInfo(){
        String info;
        info = "Utility vehicle information\nVIN number: " + getVinNumber() + "\n" + "Make :" +
                getMake() + "\n" + "Model: " + getModel() + "\n" + "Mileage: " + getMileage() + "\n";
        if (getFourWheelDrive())
            info = info +"It has four wheel drive." + "\n";
        else
            info = info + "It has not four wheel drive." + "\n";
        return (info);
    }
}
