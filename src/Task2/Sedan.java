package Task2;

public class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "Sedan: VIN=" + vinNumber + ", Make=" + make + ", Model=" + model + ", Mileage=" + mileage;
    }

    @Override
    public void startEngine() {
        System.out.println("Sedan engine started.");
    }

    @Override
    public void drive(int distance) {
        mileage += distance;
        System.out.println("Sedan drove " + distance + " km. Total mileage: " + mileage);
    }
}