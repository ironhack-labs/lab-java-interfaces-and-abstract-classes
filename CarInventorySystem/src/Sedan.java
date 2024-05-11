public class Sedan extends Car {
public Sedan(String vinNumber, String make, String model, int mileage) {
    this.vinNumber = vinNumber;
    this.make = make;
    this.model = model;
    this.mileage = mileage;
}
    @Override
    public String toString() {
        return "Type: Truck, VIN: " + vinNumber +
                ", Make: " + make +
                ", Model: " + model +
                ", Mileage: " + mileage;
    }
}

