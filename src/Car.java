public abstract class Car {
    String vinNumber;
    String make;
    String model;
    int mileage;

    public String getInfo() {
        return "VIN: " + vinNumber + " Make: " + make + " Model: " + model + " Mileage: " + mileage;
    }
}
