package CarInventorySystem;

public abstract class Car {


    // Properties
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;


    // Methods
    public String getInfo() {
        return "Car{" +
                "vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
