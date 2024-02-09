package org.example.carInventory;

public class Sedan extends Car{
    public Sedan(String vinNumber, String make, String model, int mileage){
        super(vinNumber, make, model, mileage);
    }
    public String getInfo(){
        return "The sedan has a vinNumber "+getVinNumber()+", the make is "+getMake()+" with the model "+getModel()+" and "+getMileage()+" as mileage";
    }

}
