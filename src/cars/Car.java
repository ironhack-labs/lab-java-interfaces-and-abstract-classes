package src.cars;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getInfo() {
        return String.format("VIN: %s, Make: %s, Model: %s, Mileage: %d miles", this.vinNumber, this.make, this.model, this.mileage);
    }
}
