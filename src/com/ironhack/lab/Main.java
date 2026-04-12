package com.ironhack.lab;

import com.ironhack.lab.exercise1.BigDecimalOperations;
import com.ironhack.lab.exercise2.Sedan;
import com.ironhack.lab.exercise2.Truck;
import com.ironhack.lab.exercise2.UtilityVehicle;
import com.ironhack.lab.exercise3.TvSeries;
import com.ironhack.lab.exercise3.Movie;
import com.ironhack.lab.exercise4.IntArrayList;
import com.ironhack.lab.exercise4.IntVector;

import java.math.BigDecimal;

public class Main {
    public  static void main(String[] args){
        System.out.println("Iniciando lab sem 3");

        //Creando un Bigdecimal
        BigDecimal value = new BigDecimal("2.4532");


        System.out.println("The value in exercise 1 is: " + BigDecimalOperations.roundBigDecimalToDouble(value));
        System.out.println("The value in exercise 2 is: " + BigDecimalOperations.negateAndRound (value));

        System.out.println("=== Car Inventory Test ===");

        // Sedan
        Sedan sedan = new Sedan("VIN001", "Toyota", "Corolla", 30000);
        System.out.println(sedan.getInfo());

        // UtilityVehicle
        UtilityVehicle uv = new UtilityVehicle("VIN002", "Jeep", "Wrangler", 40000, true);
        System.out.println(uv.getInfo());

        // Truck
        Truck truck = new Truck("VIN003", "Ford", "F-150", 50000, 3500.5);
        System.out.println(truck.getInfo());

        System.out.println("=== Video Test ===");

        TvSeries series = new TvSeries("Breaking Bad", 50, 62);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());

        System.out.println("=== IntList Test ===");

        IntArrayList arrayList = new IntArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("IntArrayList element at index 0: " + arrayList.get(0));
        System.out.println("IntArrayList element at index 1: " + arrayList.get(1));
        System.out.println("IntArrayList element at index 2: " + arrayList.get(2));

        IntVector vector = new IntVector();
        vector.add(100);
        vector.add(200);
        vector.add(300);

        System.out.println("IntVector element at index 0: " + vector.get(0));
        System.out.println("IntVector element at index 1: " + vector.get(1));
        System.out.println("IntVector element at index 2: " + vector.get(2));
    }
}
