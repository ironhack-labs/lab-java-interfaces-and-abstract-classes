
public abstract class Car {
    String make;
    String vinNumber;
    String model;
    int mileage;

    public Car(String make, String vinNumber, String model, int mileage) {
        this.make = make;
        this.vinNumber = vinNumber;
        this.model = model;
        this.mileage = mileage;
    }

    public Car() {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
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

    public abstract void close();



}



