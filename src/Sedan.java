public class Sedan extends Car {
    public Sedan(String vinNumber, String make, int mileage, String model) {
        super(vinNumber, make, mileage, model);
    }

    @Override
    public String getInfo(){
        return "Sedan - VIN: " + getVinNumber() + ", Make: " + getMake() + ", Model: " +getModel()+ ", Mileage: " + getMileage();
    }
}
