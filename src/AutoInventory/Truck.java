package AutoInventory;

public class Truck extends Car {
    double towingCapacity;
    public Truck(String VIN, String make, String model, int mileage, double towingCapacity) {
        super(VIN,make,model,mileage);
        this.towingCapacity = towingCapacity;
    }
    public void getInfo(){
        System.out.println("VIN: " + getVIN() + "\n" +"Make: " + getMake() + "\n" + "Model: "+
                getModel() + "\n" + "Mileage: " + getMileage() + "\n" + "Towing capacity: " + towingCapacity);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
