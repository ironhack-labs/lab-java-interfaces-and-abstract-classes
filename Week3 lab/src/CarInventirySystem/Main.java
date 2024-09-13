//Car Inventory System
//Suppose you are building a car inventory system. All cars have a vinNumber, make, model and mileage.
// But no car is just a car. Each car is either a Sedan, a UtilityVehicle or a Truck.
//Create an abstract class named Car and define the following properties and behaviors:
//vinNumber: a String representing the VIN number of the car
//make: a String representing the make of the car
//model: a String representing the model of the car
//mileage: an int representing the mileage of the car
//getInfo(): a method that returns a String containing all of the car's properties in a readable format
//Create three classes that extend Car: Sedan, UtilityVehicle and Truck.
//UtilityVehicle objects should have an additional fourWheelDrive property, a boolean that represents whether the vehicle has
// four-wheel drive.
//Truck objects should have an additional towingCapacity property, a double that represents the towing capacity of the truck.

package CarInventirySystem;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Car car1 = new Sedan("2377TH431293GHE62", "Mitsubishi", "Mirage", 9236);
        Car car2 = new UtilityVehicle("1293GH622377TH4R3", "Bobcat", "UV32", 3465, true);
        Car car3 = new Truck("44004UT889367WH62", "Ford", "Ranger", 12201, 2.3);
        Car car4 = new UtilityVehicle("89367WH6244004UT8", "Carryall", "1500 2WD", 1465, false);


//        Car[] cars = {car1, car2, car3, car4};


        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
        System.out.println(car3.getInfo());
        System.out.println(car4.getInfo());



    }
}

