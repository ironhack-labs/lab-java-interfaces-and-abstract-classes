package com.ironhack.cars;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("123A", "Toyota", "Corolla", 25000);
        Truck truck = new Truck("456B", "Ford", "F-150", 40000, 5000.0);
        UtilityVehicle suv = new UtilityVehicle("789C", "Jeep", "Wrangler", 30000, true);

        System.out.println(sedan.getInfo());
        System.out.println(truck.getInfo());
        System.out.println(suv.getInfo());
    }
}

