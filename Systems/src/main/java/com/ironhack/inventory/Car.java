package com.ironhack.inventory;

public abstract class Car {

    String vinNumber;
    String make;
    String model;
    int milleage;

    public Car(String make, int milleage, String model, String vinNumber) {
        this.make = make;
        this.milleage = milleage;
        this.model = model;
        this.vinNumber = vinNumber;
    }

    public String getInfo(){
        String info = "This car's vinnumber is: " + this.vinNumber + " make is : " + this.make +
                " mode is : " + this.model + " millage equals to + " + this.milleage;
        return info;

    }

}
