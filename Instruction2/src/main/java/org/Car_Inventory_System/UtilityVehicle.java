package org.Car_Inventory_System;

public class UtilityVehicle extends Car{
    boolean isFourWheelVehicle;
    public UtilityVehicle(String vinNumber,String make,String model,int mileage,boolean isFourWheelVehicle){
        super(vinNumber, make ,model ,mileage);
        this.isFourWheelVehicle=isFourWheelVehicle;
    }
    public boolean getFourWheelVehicle(){
        return isFourWheelVehicle;
    }
    public void setFourWheelVehicle(boolean isFourWheelVehicle){
        this.isFourWheelVehicle=isFourWheelVehicle;
    }
    @Override
    public String getInfo(){
        String info= String.format("Vin number is " + getVinNumber() + ".\nMake is "+ getMake() +"\nmodel is " + getModel() + "\nmileage is "+getMileage() +"\nIs it 4 wheel vehicle : " +getFourWheelVehicle());
        return info;
    }
}
