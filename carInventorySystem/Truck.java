package carInventory;

public class Truck extends Car{
    private double towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public String getType() {
        return null;
    }
}
