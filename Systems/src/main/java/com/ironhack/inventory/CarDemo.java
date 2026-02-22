package com.ironhack.inventory;

public class CarDemo {
    static void main() {
        Car sedan = new Sedan("Kia" , 100 , " forte " , "BHH482KKW");
        Car truck = new Truck("Truck " , 200 , "ATEGO","DLSF324SD" , 200.00);
        Car moto = new UtilityVehicle("Moto" , 150 , "RAW" , "SDFD32SQ" ,   false   );

        System.out.println("Sedans general info is : " + sedan.getInfo());
        System.out.println("Truck's general indo is : "+ truck.getInfo());
        System.out.println("Moto's general info is : " + moto.getInfo());
    }
}
