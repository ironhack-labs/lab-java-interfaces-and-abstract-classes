public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

//    //Constructor
    public Car (String vinNumber, String make, String model, int mileage) {
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    //Setters
    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    //Getters
    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    // Method that returns a String containing all car's properties
    public String getInfo() {
        return "The properties of the car are: \n VIN Number: " + vinNumber + "\n Make:  " + make + "\n Model:  " + model + "\n Mileage:  " + mileage;
    }
}
