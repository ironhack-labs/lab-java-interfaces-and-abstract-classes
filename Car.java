public class Car {
    private String vin;
    private String make;
    private String model;
    private int mileage;

    public Car(String vin, String make, String model, int mileage) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

    public String getInfo(){
        return "The Vehicle Make is: " + make + ", The Vehicle Model is " + model + ", This vehicle only has " + mileage + " miles!";
    }
}
