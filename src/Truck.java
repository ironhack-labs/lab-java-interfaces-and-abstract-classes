public class Truck extends Car{
    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public double towingCapacity;

    public Truck(String vinNumber, String make, int mileage, double towingCapacity, String model) {
        super(vinNumber, make, mileage, model);
        this.towingCapacity = towingCapacity;
    }

    public String getInfo(){
        return "Truck - VIN: " + getVinNumber() + ", Make: " + getMake() + ", Model: " + getModel()+ ", Mileage: " + getMileage() +"TowingCapacity" + getTowingCapacity();
    }
}
