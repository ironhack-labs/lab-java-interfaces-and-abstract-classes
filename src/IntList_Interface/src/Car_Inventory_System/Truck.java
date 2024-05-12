package IntList_Interface.src.Car_Inventory_System;

public class Truck extends Car {

    private double towingCapacity;


    public Truck(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

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
}
