public class CarInventorySystem {

    /*
    Suppose you are building a car inventory system. All cars have a vinNumber, make, model and mileage.
    But no car is just a car. Each car is either a Sedan, a UtilityVehicle or a Truck.
    Create an abstract class named Car and define the following properties and behaviors:
    vinNumber: a String representing the VIN number of the car
    make: a String representing the make of the car
    model: a String representing the model of the car
    mileage: an int representing the mileage of the car
    getInfo(): a method that returns a String containing all of the car's properties in a readable format
    Create three classes that extend Car: Sedan, UtilityVehicle and Truck.
    UtilityVehicle objects should have an additional fourWheelDrive property, a boolean that
    represents whether the vehicle has four-wheel drive.
    truck objects should have an additional towingCapacity property, a double that represents
    the towing capacity of the truck.
     */

    public static void main(String[] args) {

        Sedan sedan = new Sedan("AER768", "HONDA", "CIVIC", 50000);
        System.out.println(sedan.getInfo());
        Car ut = new UtilityVehicle("BFG666", "Renault", "Kangoo", 30000, false);
        System.out.println(ut.getInfo());
        Truck truck = new Truck("XXXYYYZZZ", "Mercedez-Benz", "Actros", 3000, 31500000.00d);
        System.out.println(truck.getInfo());
    }

    static abstract class Car {

        public Car(String vinNumber, String make, String model, int mileage) {
            this.vinNumber = vinNumber;
            this.make = make;
            this.model = model;
            this.mileage = mileage;
            //System.out.println("Car constructor");
        }

        abstract String getInfo();

         String vinNumber;
         String make;
         String model;
         int mileage;

    }

    static class Sedan extends Car{

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

    static class UtilityVehicle extends Car{

        public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
            super(vinNumber, make, model, mileage);
            this.fourWheelDrive=fourWheelDrive;
        }

        @Override
        String getInfo() {
            return "UtilityVehicle{" +
                    "fourWheelDrive=" + fourWheelDrive +
                    ", vinNumber='" + vinNumber + '\'' +
                    ", make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", mileage=" + mileage +
                    '}';
        }
        boolean fourWheelDrive;
    }

    static class Truck  extends Car{

        public Truck (String vinNumber, String make, String model, int mileage, double towingCapacity ) {
            super(vinNumber, make, model, mileage);
            this.towingCapacity =towingCapacity ;
        }

        @Override
        String getInfo() {
            return "Truck{" +
                    "towingCapacity =" + towingCapacity  +
                    ", vinNumber='" + vinNumber + '\'' +
                    ", make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", mileage=" + mileage +
                    '}';
        }
        double towingCapacity ;
    }

}
