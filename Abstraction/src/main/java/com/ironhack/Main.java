package com.ironhack;


import java.math.BigDecimal;

import static com.ironhack.BigDecimalOperations.reverseSignAndRoundToTenth;

public class Main {
    static void main() {

        System.out.println(reverseSignAndRoundToTenth(new BigDecimal("1.2345")));
        System.out.println(reverseSignAndRoundToTenth(new BigDecimal("-45.67")));



       Sedan sedan = new Sedan("VIN123", "Toyota", "Camry", 50000);
       UtilityVehicle suv = new UtilityVehicle("VIN456", "Jeep", "Wrangler", 30000, true);
       Truck truck = new Truck("VIN789", "Ford", "F-150", 40000, 12000.5);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());


        Movie movie =new Movie("Alo",120,4.5);
        TvSeries series=new TvSeries("AloAlo",240,12);

        System.out.println(movie.getInfo());
        System.out.println(series.getInfo());

    }
}
