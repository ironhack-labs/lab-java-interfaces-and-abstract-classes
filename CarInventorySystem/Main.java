package CarInventorySystem;

public class Main {
    public static void main(String[] args) {
        Sedan car1 = new Sedan("123456789", "Ford", "Focus", 34000);
        UtilityVehicle car2 = new UtilityVehicle("2233441199", "Ford", "Explorer", 22500, true);
        Truck car3 = new Truck("987654321", "Ford", "Transit", 97600, 3.5);
        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
        System.out.println(car3.getInfo());
    }
}
