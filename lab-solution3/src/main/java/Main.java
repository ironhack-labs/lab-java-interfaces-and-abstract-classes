package com.ironhack;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // 1. Prueba de BigDecimal Operations
        System.out.println("--- 1. BigDecimal Operations ---");
        BigDecimal testNum1 = new BigDecimal("4.2545");
        System.out.println("Original: 4.2545 | Redondeado (centésimas): " +
                BigDecimalOperations.roundToHundredth(testNum1));

        BigDecimal testNum2 = new BigDecimal("1.2345");
        BigDecimal testNum3 = new BigDecimal("-45.67");
        System.out.println("Original: 1.2345 | Invertido y Redondeado (décimas): " +
                BigDecimalOperations.inverseAndRoundToTenth(testNum2));
        System.out.println("Original: -45.67 | Invertido y Redondeado (décimas): " +
                BigDecimalOperations.inverseAndRoundToTenth(testNum3));
        System.out.println();

        // 2. Prueba de Car Inventory System
        System.out.println("--- 2. Car Inventory System ---");
        Car mySedan = new Sedan("ABC12345", "Toyota", "Corolla", 15000);
        Car mySUV = new UtilityVehicle("XYZ67890", "Jeep", "Wrangler", 5000, true);
        Car myTruck = new Truck("TRK999", "Ford", "F-150", 25000, 5000.5);

        System.out.println(mySedan.getInfo());
        System.out.println(mySUV.getInfo());
        System.out.println(myTruck.getInfo());
        System.out.println();

        // 3. Prueba de Video Streaming Service
        System.out.println("--- 3. Video Streaming Service ---");
        Video myMovie = new Movie("Inception", 148, 8.8);
        Video mySeries = new TvSeries("The Bear", 30, 18);

        System.out.println(myMovie.getInfo());
        System.out.println(mySeries.getInfo());
        System.out.println();

        // 4. Prueba de IntList Interface
        System.out.println("--- 4. IntList System (Growth Test) ---");

        IntList arrayList = new IntArrayList();
        System.out.println("Añadiendo 12 elementos a IntArrayList...");
        for (int i = 1; i <= 12; i++) {
            arrayList.add(i * 10);
        }
        System.out.println("Elemento en índice 11: " + arrayList.get(11));

        IntList vector = new IntVector();
        System.out.println("Añadiendo 22 elementos a IntVector...");
        for (int i = 1; i <= 22; i++) {
            vector.add(i * 5);
        }
        System.out.println("Elemento en índice 21: " + vector.get(21));
    }
}