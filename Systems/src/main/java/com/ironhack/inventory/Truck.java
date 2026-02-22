package com.ironhack.inventory;

public class Truck extends Car{
    double towingCapacity;

    public Truck(String make, int milleage, String model, String vinNumber, double towingCapacity) {
        super(make, milleage, model, vinNumber);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo(){
        String info = "This car's vinnumber is: " + this.vinNumber + " make is : " + this.make +
                " mode is : " + this.model + " millage equals to + " + this.milleage
                + " what is its capacity ? : " + this.towingCapacity;
        return info;
    }
}
