//Suppose you are building a video streaming service. All videos are either TV series or movies.
//Create an abstract class named Video and define the following properties and behaviors:
//title: a String representing the title of the video
//duration: an int representing the duration of the video in minutes
//getInfo(): a method that returns a String containing all of the video's properties in a readable format
//Create two classes that extend Video: TvSeries and Movie.
//TvSeries objects should have an additional episodes property, an int representing the number of episodes in the series.
//Movie objects should have an additional rating property, a double representing the rating of the movie.

package VideoStreamingService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Video video1 = new TvSeries("Breaking Bad", 45, 62);
        Video video2 = new Movie("The Shawshank Redemption", 142, 9.3);
        Video video3 = new TvSeries("Planet Earth II", 50, 6);
        Video video4 = new Movie("The Godfather", 175, 9.2);
        Video video5 = new TvSeries("Game of Thrones", 60, 73);
        Video video6 = new Movie("The Dark Knight", 152, 9.0);

        System.out.println(video1.getInfo());
        System.out.println(video2.getInfo());
        System.out.println(video3.getInfo());
        System.out.println(video4.getInfo());
        System.out.println(video5.getInfo());
        System.out.println(video6.getInfo());
    }
}
