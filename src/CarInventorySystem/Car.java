package CarInventorySystem;

abstract class Car {
    // Constructors
    Car(String vinNumber, String make, String model, int mileage) {
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    // Attributes
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    // Getters and Setters
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // Methods
    public String getInfo() {
        return "{\n"
                + "\t" + "Vin Number: " + getVinNumber() + "\n"
                + "\t" + "Make: " + getMake() + "\n"
                + "\t" + "Model: " + getModel() + "\n"
                + "\t" + "Mileage: " + getMileage() + "\n"
                + "}";
    }
}
