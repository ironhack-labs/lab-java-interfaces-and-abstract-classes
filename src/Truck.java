public class Truck extends Car {
    private double towingCapacity;

    // Constructor
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    // Setter towingCapacity
    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    // Getter towingCapacity
    public double getTowingCapacity() {
        return towingCapacity;
    }
}
