package org.example.carinventorysystemtask;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String getInfo(){
        String readableFormat = "VIN number: " + vinNumber + "\n" +
                "Make: " + make + " \n" +
                "Model: " + model + " \n" +
                "Mileage: " + mileage ;
        return readableFormat;
    }

    }
