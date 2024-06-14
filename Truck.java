public class Truck extends Car{
private double towingCapacity;

    public Truck(String vin, String make, String model, int mileage, double towingCapacity) {
        super(vin, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
