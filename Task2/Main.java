package Task2;

public class Main {
    public static void main(String[] args) {
        Sedan car1 = new Sedan();
        car1.vinNumber = "LAWPCTJX50150356";
        car1.make = "Honda";
        car1.model = "Civic";
        car1.mileage = 0;
        System.out.println(car1.getInfo());

        System.out.println("/////////////////////////////////////////////////////////////");

        Truck truck1 = new Truck();
        truck1.vinNumber = "WOOOASO5006188";
        truck1.make = "Mercedes Benz";
        truck1.model = "Actros L";
        truck1.mileage = 0;
        System.out.println(truck1.getInfo());

        System.out.println("/////////////////////////////////////////////////////////////");

        UtilityVehicle utility1 = new UtilityVehicle();
        utility1.vinNumber = "TOAASLLS8004600";
        utility1.make = "Toyota";
        utility1.model = "Land Cruiser";
        utility1.mileage = 0;
        System.out.println(utility1.getInfo());
    }
}
