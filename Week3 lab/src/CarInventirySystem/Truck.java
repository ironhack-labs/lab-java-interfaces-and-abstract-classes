package CarInventirySystem;

public class Truck extends Car{
    double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public String getInfo() {
        return "The vinNumber is " + vinNumber + ". Make is " + make + ". Model is " + model + ". Mileage is " + mileage + " miles. And the towing capacity is " + towingCapacity + ".";
    }
}