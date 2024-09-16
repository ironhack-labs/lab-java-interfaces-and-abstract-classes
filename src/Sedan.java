public class Sedan extends Car {

    public Sedan (String vinNumber, String make, String model, int mileage){
        super(vinNumber, make, model, mileage);
    }

    public String getInfo(){
        return "This is a Sedan, and the Vin Number is: " + getVinNumber() + ", Make by: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage();
    }



}
