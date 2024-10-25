public abstract class Car {

    private String make;
    private String model;
    private int mileage;

    public Car(String make, int mileage, String model) {
        this.make = make;
        this.mileage = mileage;
        this.model = model;
    }

    public String getInfo (){
        return "The car is made by " +  make + " .It's the model " + model + " and it's milleage is " + mileage;
    }


    public String getMake() {
        return make;
    }

    public void setMake (String vinNumber) {
        this.make = vinNumber;
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



}
