package carInventory;

public class Truck extends Car{

    double towingCapacity;

    Truck (String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity () {
        return towingCapacity;
    }

    public void setTowingCapacity (double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "VIN: " + vinNumber + ", make: " + make + ", model: " + model + ", towing capacity: " + towingCapacity + ", mileage: " + mileage;
    }

}
