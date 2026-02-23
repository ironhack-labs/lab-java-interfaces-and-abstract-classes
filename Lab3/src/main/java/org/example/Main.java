package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Car sedan = new Sedan("VIN123", "Toyota", "Camry", 50000);
        Car suv = new UtilityVehicle("VIN456", "Jeep", "Cherokee", 40000, true);
        Car truck = new Truck("VIN789", "Ford", "F-150", 60000, 12000.5);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
