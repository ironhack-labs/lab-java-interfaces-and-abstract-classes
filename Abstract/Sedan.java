package Abstract;

public class Sedan extends Car{

    public Sedan(String VinNumber, String make, String model, int mileage) {
        super(VinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return  "VIN: " + this.getVinNumber() + ", Make: " + this.getMake() + ", Model: " + this.getModel() + ", Mileage: " + this.getMileage();
    }
}
