package video;

public class VideoTest {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 148, 8.8);
        TvSeries series = new TvSeries("Stranger Things", 400, 34);

        System.out.println("MOVIE: " + movie.getInfo());
        System.out.println("TV SERIES: " + series.getInfo());
    }
}
