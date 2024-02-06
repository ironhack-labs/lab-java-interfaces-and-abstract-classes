abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    //CONSTRUCTOR
    public Car (String vinNumber, String make, String model, int mileage) {

        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    //SETTERS
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

    //GETTERS
    public String getVinNumber() {
        return this.vinNumber;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getMileage() {
        return this.mileage;
    }

    //FUNCTION
    //returns a String with all of the car's properties.
    abstract String getInfo();

}
