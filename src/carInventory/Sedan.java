package carInventory;

public class Sedan extends Car{

    Sedan (String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "VIN: " + vinNumber + ", make: " + make + ", model: " + model + ", mileage: " + mileage;
    }
}
