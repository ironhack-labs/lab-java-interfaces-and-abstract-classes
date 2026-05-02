package Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creazione di una lista di Car per sfruttare il polimorfismo
        List<Car> concessionario = new ArrayList<>();

        // 1. Creazione di una Sedan
        Sedan miaSedan = new Sedan("ABC12345", "Toyota", "Corolla", 15000);

        // 2. Creazione di un UtilityVehicle (con parametro fourWheelDrive)
        UtilityVehicle mioSUV = new UtilityVehicle("XYZ67890", "Jeep", "Wrangler", 5000, true);

        // 3. Creazione di un Truck (con parametro towingCapacity)
        Truck mioTruck = new Truck("TRK44556", "Ford", "F-150", 1200, 3500.5);

        // Aggiungiamo i veicoli alla lista
        concessionario.add(miaSedan);
        concessionario.add(mioSUV);
        concessionario.add(mioTruck);

        // Ciclo attraverso la lista e stampa delle informazioni
        System.out.println("--- Inventario Veicoli ---");
        for (Car veicolo : concessionario) {
            System.out.println(veicolo.getInfo());
        }
    }
}