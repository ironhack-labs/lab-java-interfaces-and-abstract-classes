package VideoStreamingServices;
//Suppose you are building a video streaming service. All videos are either TV series or movies.
//Create an abstract class named Video and define the following properties and behaviors:
//title: a String representing the title of the video
//duration: an int representing the duration of the video in minutes
//getInfo(): a method that returns a String containing all of the video's properties in a readable format
//Create two classes that extend Video: TvSeries and Movie.
//TvSeries objects should have an additional episodes property, an int representing the number of episodes
// in the series.
//Movie objects should have an additional rating property, a double representing the rating of the movie.

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Fast and Furious", 120,5.0);
        TvSeries series = new TvSeries("Game of thrones", 60,78 );
        movie.getInfo();
        System.out.println(":_____:");
        movie.setRating(11);
        movie.getRating();
        System.out.println(":_____:");
        series.setDuration(20);
        series.getInfo();
    }
}
