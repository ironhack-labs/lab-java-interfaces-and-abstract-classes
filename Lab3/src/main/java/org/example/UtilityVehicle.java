package org.example;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    //constructor
    public UtilityVehicle(String vinNumber,String make,String model,int mileage,boolean fourWheelDrive){
        super(vinNumber,make,model,mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    //getters
    public boolean getFourWheelDrive(){
        return fourWheelDrive;
    }

    //setters
    public void setFourWheelDrive(boolean fourWheelDrive){
        this.fourWheelDrive = fourWheelDrive;
    }

}
