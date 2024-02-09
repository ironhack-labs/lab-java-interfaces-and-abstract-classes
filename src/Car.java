abstract class Car {
    private String vinNumber;
    private String make;
    private int mileage;

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract String getInfo();

    public Car(String vinNumber, String make, int mileage, String model) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.mileage = mileage;
        this.model = model;
    }

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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
