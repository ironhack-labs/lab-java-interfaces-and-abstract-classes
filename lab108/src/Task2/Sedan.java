package Task2;

public class Sedan extends Car{
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "These are the properties of Sedan: " + this.vinNumber + this.make + this.model + this.mileage;
    }
}
