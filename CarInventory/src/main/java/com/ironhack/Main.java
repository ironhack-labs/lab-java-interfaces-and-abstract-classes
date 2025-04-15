package com.ironhack;

public class Main {
    public static void main(String[] args) {
        // construction of Sedan
        Sedan sedan = new Sedan("1HGCM82633A123456", "Toyota", "Camry", 50000);

        // construction of  UtilityVehicle
        UtilityVehicle suv = new UtilityVehicle("5YJ3E1EA7JF123456", "Jeep", "Wrangler", 30000, true);

        // construction of Truck
        Truck truck = new Truck("1FDWX6DC3JDF123456", "Ford", "F-150", 70000, 12000.5);
    }
}


