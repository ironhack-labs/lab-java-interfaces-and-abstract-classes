package car.inventory.system;

public class Truck extends Car {

    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    @Override
    String getInfo() {
        return String.format("Car: %n vinNumber = %s%n make = %s%n model = %s%n mileage = %s%n towingCapacity = %s%n",
                super.getVinNumber(), super.getMake(), super.getModel(), super.getMileage(), getTowingCapacity());
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
