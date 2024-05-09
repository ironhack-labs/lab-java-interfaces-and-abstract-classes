package carinventory;

public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towCapacity) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.towingCapacity = towCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "towingCapacity=" + towingCapacity +
                ", vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
