package CarInventorySystem;

public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public void getInfo(){
        System.out.println("The vehicle is a " + getMake() + " " + getModel() + " with VIN number: " + getVinNumber() + " at " + getMileage() + "km " + "and with a towning capacity of " + towingCapacity);
    }


    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
