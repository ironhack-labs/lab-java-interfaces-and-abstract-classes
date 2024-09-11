package Task2;

public abstract class Car {

    private String vinNumber;
    private String make;
    private String model;
    private int mileAge;


    public Car(String vinNumber, String make, String model, int mileAge) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileAge = mileAge;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public abstract String getInfo();
}
