package lab3.CarInventorySystem;

public class Truck extends Car {

    private double towingCapacity;


    Truck(String vinNumber, String make, String model, String mileage) {
        super(vinNumber, make, model, mileage);
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }
}
