package carinventory;

public abstract class Car {

    public String vinNumber;
    public String make;
    public String model;
    public int mileage;

    public String getInfo() {
        return "Manufacturer: " + make
                + "\nModel: " + model
                + "\nMileage: "
                + mileage + " miles"
                + "\nVIN: " + vinNumber;
    }
}
