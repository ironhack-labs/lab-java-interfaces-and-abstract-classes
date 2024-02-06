abstract class Car {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {

        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    //Getters
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

    //Methods
    abstract String getInfo();
}
