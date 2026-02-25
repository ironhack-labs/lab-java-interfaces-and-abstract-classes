package org.ironhack.envsetup;

public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mielage, double towingCapacity) {
        super(vinNumber, make, model, mielage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Towing Capacity: " + towingCapacity;
    }
}
