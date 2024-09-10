
//Suppose you are building a video streaming service. All videos are either TV series or movies.

//getInfo(): a method that returns a String containing all of the video's properties in a readable format
//Create two classes that extend Video: TvSeries and Movie.
//TvSeries objects should have an additional episodes property, an int representing the number of episodes in the series.
//Movie objects should have an additional rating property, a double representing the rating of the movie.


abstract public class Video {




    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getInfo() {
        return "\n Title: " + title + "\n Duration in minutes : " + duration;
    }


    public static void main(String[] args) {

        TvSeries tvSeries = new TvSeries("Narcos", 70, 22);
        Movie movie = new Movie("Wolf of Wall Street", 220, 9.3);

        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());


    }

}
