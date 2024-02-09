public class Sedan extends Car {
    public Sedan(String vinNumber, String make, int mileage) {
        super(vinNumber, make, mileage);
    }

    @Override
    public String getInfo(){
        return "Sedan - VIN: " + getVinNumber() + ", Make: " + getMake() + ", Model: " + ", Mileage: " + getMileage();
    }
}
