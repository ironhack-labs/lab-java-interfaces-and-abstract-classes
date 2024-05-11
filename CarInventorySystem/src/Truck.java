//Truck objects should have an additional towingCapacity property,
// a double that represents the towing capacity of the truck.

public class Truck extends Car{
    private double towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.towingCapacity = towingCapacity;
    }


    @Override
    public String toString() {
        return "Type: Truck, VIN: " + vinNumber +
                ", Make: " + make +
                ", Model: " + model +
                ", Mileage: " + mileage +
                ", Towing Capacity: " + towingCapacity + " Kg";
    }
}


