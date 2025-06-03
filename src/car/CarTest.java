package car;

public class CarTest {
    public static void main(String[] args) {
        // Creamos un coche de cada tipo
        Sedan sedan = new Sedan("123ABC", "Toyota", "Corolla", 50000);
        UtilityVehicle suv = new UtilityVehicle("456DEF", "Subaru", "Outback", 30000, true);
        Truck truck = new Truck("789GHI", "Ford", "F-150", 80000, 3500.5);

        // Imprimimos la información de cada uno
        System.out.println("SEDAN: " + sedan.getInfo());
        System.out.println("UTILITY VEHICLE: " + suv.getInfo());
        System.out.println("TRUCK: " + truck.getInfo());
    }
}
