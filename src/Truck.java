public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
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
        return "This is a UtilityVehicle, and the Vin Number is: " + getVinNumber() + ", Make by: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + ", The Towing Capacity is: " + getTowingCapacity() + "Kg";
    }
}
