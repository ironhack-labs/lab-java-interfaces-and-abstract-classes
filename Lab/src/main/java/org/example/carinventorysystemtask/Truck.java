package org.example.carinventorysystemtask;

public class Truck extends Car{

    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage,double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;

    }
    @Override
    public String getInfo(){
        return "VIN number: " + getVinNumber() + "\n" +
                "Make: " + getMake() + " \n" +
                "Model: " + getModel() + " \n" +
                "Mileage: " + getMileage() + "\n" +
                "Towing Capacity: " + towingCapacity + " kg";
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

}
