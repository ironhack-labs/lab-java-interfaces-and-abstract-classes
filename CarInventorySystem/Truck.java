package CarInventorySystem;

public class Truck extends Car{
    double towingCapacity ;

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage );
    }
    public String getInfo(){
        return "vinNumber:" +getVinNumber() + " Make:" +
                getMake() + " Model:" + getModel() + " Mileage:" +getMileage()+ " Towing Capacity: " + getTowingCapacity();
    }
}
