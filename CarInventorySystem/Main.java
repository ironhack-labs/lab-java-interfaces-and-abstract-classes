package CarInventorySystem;

public class Main extends Car {
    public Main(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    public static void main(String[] args) {
        Sedan auto = new Sedan("wn1234","Toyota","corolla", 12345);
        String info = auto.getInfo();
        System.out.println(info);
        Truck truck = new Truck("wnb6969","Toyota","hilux",20000,6000);
        String infoo = truck.getInfo();
        System.out.println(infoo);
        UtilityVehicle vehicle = new UtilityVehicle("wnba696969","Iveco", "Daily", 100000);
        String infooo = vehicle.getInfo();
        System.out.println(infooo);


    }

  }
