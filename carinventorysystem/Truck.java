package carinventorysystem;

public class Truck extends Car {
    double towingCapacity;

    public Truck(double towingCapacity, String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public String getInfo() {
        return super.getInfo() + "\nTowing capacity: " + towingCapacity;
    }
}
