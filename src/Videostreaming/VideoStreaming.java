package Videostreaming;

public class VideoStreaming {
    public static void main(String[] args) {
        Video series = new TvSeries("Stranger Things", 400, 34);
        Video movie = new Movie("Inception", 148, 8.8);

        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());
    }
}
