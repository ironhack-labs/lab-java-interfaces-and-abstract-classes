package AutoInventory;

public class Main {
    public static void main(String[] args) {
            Sedan sedan = new Sedan("VKDLAJJ", "Opel", "Astra", 180033);
            UtilityVehicle utiVehicle = new UtilityVehicle("MBHDISL","Citroen","C6", 239100,true);
            Truck truck= new Truck("KFESSSLFLS","Mercedes","TRUUCK",134034,34.000);
sedan.getInfo();
        System.out.println("------");
        utiVehicle.getInfo();
        System.out.println("-----------");
        truck.getInfo();
    }
}
