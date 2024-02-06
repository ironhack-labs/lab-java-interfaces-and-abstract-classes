package CarInventorySystem;

public abstract class Car {

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



