class Sedan extends Car {
    // Constructor
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    // Override getInfo() method
    @Override
    public String getInfo() {
        return "Sedan: VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage;
    }
}

