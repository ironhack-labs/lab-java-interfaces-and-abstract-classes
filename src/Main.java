import javax.swing.border.TitledBorder;
import java.math.BigDecimal;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class Main {
    public static void main(String[] args) {
        operateWithBigDecimal();
        Car();
        Video();


    }

    public static void operateWithBigDecimal() {

        BigDecimal a = new BigDecimal("4.2545");
        BigDecimal b = a.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Returns a double of the BD to nearest 100:  " + b);
        BigDecimal c = new BigDecimal("1.2345");
        BigDecimal d = c.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println("Returns a negative value rounded to nearest tenth " + d.negate());
        BigDecimal e = new BigDecimal("544.54544465465464659");
        BigDecimal f = e.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println("Returns a huge negative number " + f.negate());

        System.out.println(" Adding them all just because: " + b + d + f);


    }

    public static void Car() {
        // Your Car operations go here
        Sedan sedan = new Sedan("123456", "Toyota", "Camry", 50000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("789012", "Ford", "Explorer", 60000, true);
        Truck truck = new Truck("345678", "Chevrolet", "Silverado", 70000, 10000.0);

        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());

    }

    /*
    Suppose you are building a video streaming service. All videos are either TV series or movies.
    Create an abstract class named Video and define the following properties and behaviors:
    title: a String representing the title of the video
    duration: an int representing the duration of the video in minutes
    getInfo(): a method that returns a String containing all of the video's properties in a readable format
    Create two classes that extend Video: TvSeries and Movie.
    TvSeries objects should have an additional episodes property, an int representing the number of episodes in the series.
    Movie objects should have an additional rating property, a double representing the rating of the movie.
*/
    public static void Video () {

        Movie movie = new Movie("Frozen", 120, 10.1);
        TvSeries tvSeries = new TvSeries("Breaking Bad", 45, 8);
        System.out.println(movie.getInfo());
        System.out.println(tvSeries.getInfo());
    }
    // Create an IntList interface
    //add(int number): a method that adds a new number to the list
    //get(int id): a method that retrieves an element by its ID



        //Create two implementations of IntList: IntArrayList
        //IntArrayList should store numbers in an array with a length of 10 by default.


    }




    // When the add method is called, you must first determine if the array is full.
    // If it is, create a new array that is 50% larger,
    // move all elements over to the new array and add the new element.
    // (For example, an array of length 10 would be increased to 15.)
    //IntVector should store numbers in an array with a length of 20 by default.
    // When the add method is called, you must first determine if the array is full.
    // If it is, create a new array that is double the size of the current array,
    // move all elements over to the new array and add the new element.
    // (For example, an array of length 10 would be increased to 20.)
    //In your README.md, include an example of when IntArrayList would be more efficient and when
    // IntVector would be more efficient.
















