package car_inventory;

public class Truck extends Car{
    double towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileAge, double towingCapacity){
        super( vinNumber, make, model, mileAge);
        this.towingCapacity=towingCapacity;
    }
    public double getTowingCapacity(){
        return this.towingCapacity;
    }
    public String getInfo(){
        return ("Truck Vehicle Info\n"+"Vin number is: "+getVinNumber()+", Make is: "+getMake()+", Model is: "+getModel()+", mileAge is: "+getMileAge()+", towingCapacity is: "+getTowingCapacity()+"\n");
    }
}
