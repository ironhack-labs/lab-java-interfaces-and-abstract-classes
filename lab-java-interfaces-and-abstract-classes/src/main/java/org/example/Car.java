package org.example;

public abstract class Car {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int milage;

    public Car(String vinNumber, String make, String model, int milage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.milage = milage;
    }

    public String getInfo(){
        return "vinNumber: " + vinNumber + "\nmake: " + make + "\nmodel: " + model + "\nmilage: " + milage;
    }

    public String getVinNumber(){
        return vinNumber;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getMilage(){
        return milage;
    }

    public void setVinNumber(String vinNumber){
        this.vinNumber = vinNumber;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setMilage(int milage){
        this.milage = milage;
    }
}
