package org.example.carInventory;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive){
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getInfo(){

        String info = "The utility vehicle has a vinNumber "+getVinNumber()+", the make is "+getMake()+" with the model "+getModel()+" and "+getMileage()+" as mileage. ";
        if (isFourWheelDrive()){
            info = info +"This vehicle has four-wheel drive.";
        }
        return info;
    }
}
