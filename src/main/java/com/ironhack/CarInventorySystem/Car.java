package com.ironhack.CarInventorySystem;

public class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        if (vinNumber == null) {
            System.err.println("vinNumber cannot be null");
        }
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) {
            System.err.println("make cannot be null");
        }
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            System.err.println("model cannot be null");
        }
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage < 0) {
            System.err.println("mileage cannot be negative");
        }
        this.mileage = mileage;
    }

    public String getInfo(){
        return "vinNumber: " +vinNumber+","+ " make: " + make+"," + " model: " + model+"," + " mileage: " + mileage;
    }
}
