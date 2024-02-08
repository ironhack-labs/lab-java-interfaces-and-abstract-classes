package carInventorySystem;

public class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    public String getInfo() {
        return "VIN: " + getVinNumber() + "\nMake: " + getMake() + "\nModel: " + getModel() + "\nMileage: " + getMileage() + "\nType: Sedan";
    }
}
