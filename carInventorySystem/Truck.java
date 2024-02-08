package carInventorySystem;

public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = getTowingCapacity();
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public String getInfo() {
        return "VIN: " + getVinNumber() + "\nMake: " + getMake() + "\nModel: " + getModel() + "\nMileage: " + getMileage() + "\nType: Truck\nTowing Capacity: " + towingCapacity + " tons";
    }
}
