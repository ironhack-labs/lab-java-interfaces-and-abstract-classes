package car;

public class Main {
    public static void main(String[] args) {

        Truck truck1 = new Truck("12345", "toyota", "sel", 456789, 67.000);
        UtilityVehicle vehicle1 = new UtilityVehicle("45789", "ford", "els", 1000, true);

        System.out.println(truck1.getInfo());
        System.out.println(truck1.getTowingCapacity());
        System.out.println(vehicle1.getInfo());
        System.out.println(vehicle1.isFourWheelDrive());


    }

}