//Suppose you are building a car inventory system. All cars have a vinNumber, make, model and mileage.
// But no car is just a car. Each car is either a Sedan, a UtilityVehicle or a Truck.

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan ("121212", "Dacia", "Sandero Stepway", 47000 );
        Truck truck = new Truck("313131", "Dodge", "RAM", 15000, 3500);
        UtilityVehicle utilityvehicle = new UtilityVehicle("030303", "Skoda","Kodiaq",15000,true);


        System.out.println(truck.toString());
        System.out.println(sedan.toString());
        System.out.println(utilityvehicle.toString());
    }
}