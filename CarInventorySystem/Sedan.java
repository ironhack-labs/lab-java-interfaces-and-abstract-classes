package CarInventorySystem;

public class Sedan extends CarInventorySystem.Car {

        public Sedan(String vinNumber, String make, String model, int mileage) {
            super(vinNumber, make, model, mileage);
            //System.out.println("Sedan constructor");
        }



    @Override
    public String getInfo() {
        return "Sedan{" +
                ", vinNumber='" + getVinNumber() + '\'' +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                '}';
    }

}

