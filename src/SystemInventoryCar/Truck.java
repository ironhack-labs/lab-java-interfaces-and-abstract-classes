package SystemInventoryCar;

public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double isTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity){
        this.towingCapacity = towingCapacity;
    }

    @Override

    public String getInfo (){
        return ("Nº vin: " + getVinNumber() + "\nMake: " + getMake() + "\nModel: " + getModel() + "\nMileage: " + getMileage() + "KM. " + "\nTowing capacity: " + towingCapacity + "Kg.");
    }
}
