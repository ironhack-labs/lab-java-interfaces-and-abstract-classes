package com.ironhack;

public abstract class Car {

    //a String representing the VIN number of the car
    private String vinNumber;//

    //a String representing the marque of the car
    private String make;

    // a String representing the model of the car
    private String model;

    //an int representing the mileage=kilométrage of the car
    private int mileage;


    //The method that returns a String containing all  car's properties in a readable format
    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }
//Getter & Setter because my variables are private
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
//The method that returns a String containing all  car's properties in a readable format
    @Override
    public String toString() {
        return "Car{" +
                "vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}

