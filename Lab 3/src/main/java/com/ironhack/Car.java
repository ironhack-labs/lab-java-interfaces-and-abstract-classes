package com.ironhack;

public abstract class Car {
    public String vinNumber;
    public String make;
    public String model;
    public int mileage;

    public Car(String vinNumber,String make,String model,int mileage){
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;

    }
    public String getInfo(){
        return vinNumber + " is vinNumber " + make + " is make. " + model + " is model. " + mileage + " is mileage";
    }
}
