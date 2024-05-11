public class Truck extends Car {

    public Truck(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    private double towingCapacity;

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
