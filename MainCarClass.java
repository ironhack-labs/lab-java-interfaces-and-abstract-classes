public class MainCarClass {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("1HGBH41JXMN109186", "Toyota", "Camry", 15000);
        UtilityVehicle suv = new UtilityVehicle("1HGCM82633A004352", "Ford", "Explorer", 30000, true);
        Truck truck = new Truck("1FTFW1ET1EKF52745", "Chevrolet", "Silverado", 45000, 5.0);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
