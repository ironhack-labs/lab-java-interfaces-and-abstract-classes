package org.example;

public class Truck extends Car {
//    Truck objects should have an additional towingCapacity property,
//    a double that represents the towing capacity of the truck.
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

//    Getter
    public double getTowingCapacity() {
        return towingCapacity;
    }

//    Setter
    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

//    Methods
    @Override
    public String getInfo() {
        String carInfo = super.getInfo();
        towingCapacity = getTowingCapacity();
        return carInfo + "\n" + "Towing Capacity: " + towingCapacity;
    }
}
