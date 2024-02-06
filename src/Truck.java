public class Truck extends Car {

    private double towingCapacity;

    //CONSTRUCTOR
    public Truck (String vinNumber, String make, String model, int mileage, double towingCapacity) {

        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    //SETTERS
    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    //GETTERS
    public double getTowingCapacity() {
        return this.towingCapacity;
    }

    //FUNCTIONS
    public String getInfo(){
        String info;
        info = "Truck information\nVIN number: " + getVinNumber() + "\n" + "Make: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" + "Mileage: " + getMileage() + "\n" +
                "Towing capacity: " + getTowingCapacity() + "\n";
        return (info);
    }
}


