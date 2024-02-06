import java.math.RoundingMode;
import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {

        //Big decimal operations - exercise 1
        double newNumber = nbDouble(new BigDecimal("4.2545"));
        //Big decimal operations - exercise 2
        BigDecimal newBigDecimal = bigDecimalRoundedTenth(new BigDecimal("-45.67"));

        //Car inventor system
        carInventorSystemCheck();

        //Video Streaming Service
        videoStreaming();

        //IntList Interface
        intListInterface();

    }

    //Method that returns a double of the BigDecimal number rounded to the nearest hundredth.
    public static double nbDouble(BigDecimal nbBigDecimal){

        //create a new Big Decimal rounded to the nearest hundredth
        BigDecimal bigDecimalRounded = nbBigDecimal.setScale(2, RoundingMode.HALF_UP);

        //coverts the new Big Decimal to a double
        double nbDouble = bigDecimalRounded.doubleValue();
        System.out.println(nbBigDecimal + " rounded to the hundredth is " + nbDouble);
        return (nbDouble);
    }

    //Method that returns a double of the BigDecimal number rounded to the nearest tenth and negate it.
    public static BigDecimal bigDecimalRoundedTenth(BigDecimal nbBigDecimal){

        BigDecimal newBigDecimal = nbBigDecimal.setScale(1, RoundingMode.HALF_UP).negate();
        System.out.println(nbBigDecimal + " reversing sign and rounded to the tenth is " + newBigDecimal);
        return (newBigDecimal);
    }

    //Check car Inventor System
    public static void carInventorSystemCheck(){

        //Constructors
        Sedan sedan = new Sedan("00001", "BMW", "Golf", 20000);
        UtilityVehicle utility = new UtilityVehicle("00002", "Citroen", "Berlingo", 30000, true);
        Truck truck = new Truck("00003", "Volvo", "FM", 25000, 10000);

        //Get information of cars
        System.out.println(sedan.getInfo());
        System.out.println(utility.getInfo());
        System.out.println(truck.getInfo());
    }

    //Video streaming service
    public static void videoStreaming(){

        //Constructors
        TvSeries tvseries = new TvSeries("Dark", 158, 45);
        Movie movie = new Movie("Titanic", 123, 4.8);

        //Get information of Videos
        System.out.println(tvseries.getInfo());
        System.out.println(movie.getInfo());

    }

    //Integer List Interface
    public static void intListInterface(){

        //ARRAY LIST - check intArrayList class
        IntArrayList newArrayList = new IntArrayList();

        //Add 20 elements int the array list, checking the storage each time.
        for(int i=0; i < 20; i++){
            newArrayList.add(i);
            System.out.println("New number added: " + newArrayList.get(i));
            System.out.println("Storage: " + newArrayList.getStore());
        }
        //Print all numbers of array list to check that they are properly added.
        for(int i=0; i < newArrayList.getArrayList().size(); i++){
            System.out.println(newArrayList.get(i));
        }

        //VECTOR - check intVector class
        IntVector newVector = new IntVector();
        //Add 25 elements int the array, checking the storage each time.
        for(int i=0; i < 25; i++){
            newVector.add(i);
            System.out.println("New number added: " + newVector.get(i));
            System.out.println("Storage: " + newVector.getStore());
        }
        //Print all numbers of array  to check that they are properly added.
        for(int i=0; i < 25; i++){
            System.out.println(newVector.get(i));
        }
    }
}
