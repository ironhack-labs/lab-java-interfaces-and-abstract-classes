package org.example;
import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //    Exercise 1 and 2
        BigDecimal bd1 = new BigDecimal("1.2345");
        BigDecimal bd2 = new BigDecimal("-45.677");

        System.out.println(BigDecimalMath.rounded(bd1));
        System.out.println(BigDecimalMath.rounded(bd2));
        System.out.println(BigDecimalMath.roundedReversed(bd1));
        System.out.println(BigDecimalMath.roundedReversed(bd2));

        //    Exercise 3
        Sedan sedan = new Sedan("121212", "2024", "V3", 90000);
        Truck truck = new Truck("54545454", "2019", "M3", 100000, 20.2);
        UtilityVehicle uv = new UtilityVehicle("14242424", "2021", "U3", 60000, false);

        System.out.println(sedan.getInfo());
        System.out.println("\n");
        System.out.println(truck.getInfo());
        System.out.println("\n");
        System.out.println(uv.getInfo());

        //    Exercise 4
        Movie movie = new Movie("Inception", 180, 9.8);
        TvSeries tvSeries = new TvSeries("The Walking Dead", 55, 200);

        System.out.println(movie.getInfo());
        System.out.println("\n");
        System.out.println(tvSeries.getInfo());

        //    Exercise 5
        IntArrayList intArrayList = new IntArrayList();
        for (int i = 0; i < 11; i++) {
            intArrayList.add(i);
        }
        System.out.println(intArrayList.get(0));
        System.out.println(intArrayList.get(9));
        System.out.println(intArrayList.get(10));

        System.out.println("\n");
        IntVector intVector = new IntVector();


        for (int i = 0; i < 21; i++) {
            intVector.add(i);
        }
        System.out.println(intVector.get(0));
        System.out.println(intVector.get(10));
        System.out.println(intVector.get(20));


    }

}