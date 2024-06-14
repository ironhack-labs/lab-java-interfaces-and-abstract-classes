public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;


    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }
    public Car(){}

    public String getInfo(){
        return "The Make is: " + make + "\n model: " + model
                + "\n mileage: " + mileage + "\n and vinNumber is: " + vinNumber;

    }


}
