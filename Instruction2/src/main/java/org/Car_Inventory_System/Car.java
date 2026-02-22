package org.Car_Inventory_System;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;
    public Car(String vinNumber,String make,String model,int mileage){
        this.vinNumber=vinNumber;
        this.make=make;
        this.model=model;
        this.mileage=mileage;
    }
    public abstract String getInfo();

    public void setVinNumber(String vinNumber){
        vinNumber=vinNumber.toUpperCase();
        if(vinNumber.length()==17 && vinNumber.contains("O,Q,I")){
        this.vinNumber=vinNumber;}
        else{
            this.vinNumber="invalid";
            System.err.println("Vin code is invalid .Try to set again.");
        }
    }
    public String getVinNumber(){
        return vinNumber;
    }
    public void setMake(String make){
        this.make=make;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel() {return model;
    }
    public void setMileage(int mileage){this.mileage=mileage;
    }
    public int getMileage(){
        return mileage;
    }
}
