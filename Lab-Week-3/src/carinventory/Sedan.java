package carinventory;

public class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
