abstract class Car {
    private String vinNumber;
    private String make;
    private int mileage;

    public abstract String getInfo();

    public Car(String vinNumber, String make, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.mileage = mileage;
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
