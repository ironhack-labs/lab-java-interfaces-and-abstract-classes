public class Truck extends Car {
    private double towingCapacity;

    // Constructor
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    // Setter towingCapacity
    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    // Getter towingCapacity
    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Method that returns a String containing all car's properties
    public String getInfo() {
        return "The properties of the truck are: \n VIN Number: " + super.getVinNumber() + "\n Make:  " + super.getMake() + "\n Model:  " + super.getModel() + "\n Mileage:  " + super.getMileage() + "\n Towing capacity: " + towingCapacity;
    }
}
