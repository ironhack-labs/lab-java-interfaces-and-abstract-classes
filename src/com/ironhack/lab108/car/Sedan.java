package com.ironhack.lab108.car;

public class Sedan extends Car{
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public void getInfo() {
        System.out.println("------------- Car Information -------------" +
                            "\nVin Number : " + getVinNumber() +
                            "\nMake       : " + getMake() +
                            "\nModel      : " + getModel() +
                            "\nMileage    : " + getMileage());
    }
}
