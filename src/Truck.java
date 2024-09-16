public class Truck extends Car{

    private final double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }
}