package src.cars;

public class Truck extends Car {
    private double towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    private void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public String getInfo() {
        return String.format("%s, Towing Capacity: %.2f", super.getInfo(), this.towingCapacity);
    }
}
