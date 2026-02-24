package lab3.CarInventorySystem;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private String mileage;

    Car(String vinNumber,String make,String model,String mileage){
        this.vinNumber=vinNumber;
        this.make=make;
        this.model=model;
        this.mileage=mileage;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getMileage() {
        return mileage;
    }

    public String getInfo(){
        return "VIN: " + vinNumber +
                ", Make: " + make +
                ", Model: " + model +
                ", Mileage: " + mileage;
     }




}
