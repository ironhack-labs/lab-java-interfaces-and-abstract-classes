import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {


        //BigDecimal Operations
        BigDecimal bigDecimaltoMethod = new BigDecimal(123.36454363);
        System.out.println("Big decimal number: " + bigDecimaltoMethod);

        System.out.println("\nBig decimal rounded 2 places");
        bigDecimalRound(bigDecimaltoMethod);
        //System.out.println(bigDecimalRound(bigDecimaltoMethod));
        double rounded = bigDecimalRound(bigDecimaltoMethod);
        System.out.println(rounded);


        System.out.println("\nBig decimal sign reversed, 1 decimal place");
        bigDecimalSignReversal(bigDecimaltoMethod);
        double reversed = bigDecimalSignReversal(bigDecimaltoMethod);
        System.out.println(reversed);


        // Car Inventory System

        Sedan sedan0 = new Sedan("Jj32nbdfjn", "Toyota", "T1", 12334);
        UtilityVehicle utilityVehicle0 = new UtilityVehicle("JJSAN3324N", "Yugo", "Y1", 1233, true);
        Truck truck0 = new Truck("F324FGG3", "Ford", "F666", 1234432, 432.54);


       /* System.out.println(sedan0);
        System.out.println(utilityVehicle0);
        System.out.println(truck0);*/


        //   Car Get info methods
        System.out.println(sedan0.getInfo());
        System.out.println(utilityVehicle0.getInfo());
        System.out.println(truck0.getInfo());


        System.out.println("\nVideo Streaming Service");

        Movie movie0 = new Movie("Ghost dog", 69, 5);
        Movie movie1 = new Movie("TMNT", 80, 6.2);
        System.out.println(movie0.getInfo());

        TvSeries tvSeries0 = new TvSeries("Oz", 47, 43);
        System.out.println(tvSeries0.getInfo());


        //Create instance for IntArrayList

        IntList intListFromArray = new IntArrayList();

        intListFromArray.add(12);
        intListFromArray.add(122);
        intListFromArray.add(1222);

        int valueAtId = intListFromArray.get(1);
        //System.out.println(valueAtId);

        //Create instances for Vector

        IntList intListVector = new Vector();

        intListVector.add(30);
        intListVector.add(330);
        intListVector.add(3330);
        //System.out.println(intListVector.get(valueAtId));




        //System.out.println(intListFromArray);




    }//end of Main


    //  Big Decimal Operations methods

    public static double bigDecimalRound(BigDecimal bigDecimaltoMethod) {
        //System.err.println(bigDecimaltoMethod);
        return bigDecimaltoMethod.setScale(2, RoundingMode.HALF_EVEN).doubleValue();

    }


    public static double bigDecimalSignReversal(BigDecimal bigDecimaltoMethod) {
        bigDecimaltoMethod = bigDecimaltoMethod.negate();
        //System.out.println(bigDecimaltoMethod);
        bigDecimaltoMethod = bigDecimaltoMethod.setScale(1, RoundingMode.HALF_EVEN);
        //System.out.println(bigDecimaltoMethod);
        double reversedBigDecimaltoReturn = bigDecimaltoMethod.doubleValue();
        //System.err.println(reversedBigDecimaltoReturn);
        return reversedBigDecimaltoReturn;
    }
}






