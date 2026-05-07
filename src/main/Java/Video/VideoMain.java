package Java.Video;

public class VideoMain {

    public static void main(String[] args) {

        TvSeries series = new TvSeries(
                "Breaking Bad",
                3000,
                62
        );

        Movie movie = new Movie(
                "Inception",
                148,
                8.8
        );

        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());
    }
}
