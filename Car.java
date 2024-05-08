public abstract class Car {

    //Attributes
        private int vinNumber;
        private String make;
        private String model;
        private int mileage;


    //Constructor
    public Car(String make, String model, int mileage, int vinNumber){
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }


    public int getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }








}
