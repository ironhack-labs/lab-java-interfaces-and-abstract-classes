package CarInventirySystem;

abstract class Car {
    String vinNumber;
    String make;
    String model;
    int mileage;

    public String getInfo() {
        return "The vinNumber is " + vinNumber + ". Make is " + make + ". Model is " + model + ". Mileage is " + mileage + " miles.";
    }

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

}
