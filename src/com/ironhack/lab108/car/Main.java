package com.ironhack.lab108.car;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan("1HGCM82633A004352", "Toyota", "Camry", 87500);
        Car utilityVehicle = new UtilityVehicle("2FMDK3GC1BBA12345", "Jeep", "Wrangler", 123000, true);
        Car truck = new Truck("3HTDTAPT5GN428776", "Volvo", "FH16", 550000, 18000.75);

        sedan.getInfo();
        utilityVehicle.getInfo();
        truck.getInfo();
    }
}
