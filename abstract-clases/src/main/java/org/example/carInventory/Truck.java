package org.example.carInventory;

public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity){
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public String getInfo(){
        return "The truck has a vinNumber "+getVinNumber()+", the make is "+getMake()+" with the model "+getModel()+" and "+getMileage()+" as mileage. The towning capacity is "+getTowingCapacity();
    }
}
