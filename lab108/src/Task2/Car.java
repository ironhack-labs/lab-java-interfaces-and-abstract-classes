package Task2;

public abstract class Car {
    public String vinNumber;
    public String make;
    public String model;
    public int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public abstract String getInfo();

}


