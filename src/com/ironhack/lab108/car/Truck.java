package com.ironhack.lab108.car;

public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public void getInfo() {
        System.out.println("------------- Car Information -------------" +
                "\nVin Number       : " + getVinNumber() +
                "\nMake             : " + getMake() +
                "\nModel            : " + getModel() +
                "\nMileage          : " + getMileage() +
                "\nTowing Capacity  : " + towingCapacity);
    }
}
