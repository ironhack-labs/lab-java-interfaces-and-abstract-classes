package CarInventorySystem;

public class Sedan extends CarInventorySystem.Car {

        public Sedan(String vinNumber, String make, String model, int mileage) {
            super(vinNumber, make, model, mileage);
            //System.out.println("Sedan constructor");
        }

        @Override
        String getInfo() {
            return "Sedan{" +
                    "vinNumber='" + vinNumber + '\'' +
                    ", make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", mileage=" + mileage +
                    '}';
        }
}

