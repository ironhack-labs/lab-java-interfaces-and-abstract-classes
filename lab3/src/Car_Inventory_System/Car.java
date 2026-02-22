package Car_Inventory_System;

public abstract class Car {

    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public String getInfo(){

        return "vinNumber is " + this.vinNumber + "\nmake is "+ make 
                +"\nmodel is " + model+ "\nmileage is "+ mileage;
    }


    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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
