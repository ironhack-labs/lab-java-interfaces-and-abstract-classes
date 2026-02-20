package org.example;

public class Truck extends Car {
    double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage,double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity=towingCapacity;
    }
    public String getInfo(){
        return getVinNumber()+","+getMake()+","+getModel()+","+getMileage()+","+towingCapacity;

    }

}
