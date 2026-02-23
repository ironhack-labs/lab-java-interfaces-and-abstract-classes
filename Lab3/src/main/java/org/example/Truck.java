package org.example;

public class Truck extends Car{
    private double towingCapacity;

    //constructor
    public Truck(String vinNumber,String make,String model,int mileage,double towingCapacity){
        super(vinNumber,make,model,mileage);
        this.towingCapacity = towingCapacity;
    }

    //getters
    public double getTowingCapacity(){
        return towingCapacity;
    }

    //setter
    public void setTowingCapacity(double towingCapacity){
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo(){
        return super.getInfo()
                +"\nTowingCapacity:"+towingCapacity;
    }

}
