package CarInventory;

public class Main {
    public static void main(String[] args){
        Car sedan = new Sedan ("JTDKB20U163197351", "Toyota", "Camry",  50000);
        Car suv = new UtilityVehicle("2A4GP54L67R185015", "Jeep", "Wrangler", 40000);
        Car truck = new Truck("1J4AA2D12AL158298", "Ford", "F-150", 35000, 6.75);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());

    }

}
