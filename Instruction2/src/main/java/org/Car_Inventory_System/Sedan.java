package org.Car_Inventory_System;

public class Sedan extends Car {
    public Sedan(String vinNumber,String make,String model,int mileage){
        super(vinNumber, make ,model ,mileage);

    }

    @Override
    public String getInfo(){
        return String.format("Vin number is " + getVinNumber() + ".\nMake is "+ getMake() +"\nmodel is " + getModel() + "\nmileage is "+getMileage());
    }
}
