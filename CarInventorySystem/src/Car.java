//Create an abstract class named Car and define the following properties and behaviors:
//vinNumber: a String representing the VIN number of the car
//make: a String representing the make of the car
//model: a String representing the model of the car
//mileage: an int representing the mileage of the car
//getInfo(): a method that returns a String containing all of the car's properties in a readable format

import org.w3c.dom.ls.LSOutput;

public abstract class Car {

    public String vinNumber;
    public String make;
    public String model;
    public int mileage;




       public String getInfo() {
           return "Manufacturer: " + make +
                   ", Model: " + model +
                   ", KM: " + mileage +
                   ", VIN Number: " + vinNumber;
       }


    //Create three classes that extend Car: Sedan, UtilityVehicle and Truck.
   }


