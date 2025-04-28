package VideoStreamingService;

public class VideoStreamingTest {
    public static void main(String[] args) {
        TvSeries series = new TvSeries("Serie", 1111, 10);
        Movie movie = new Movie("Movie", 2222, 9);

        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());
    }
}
