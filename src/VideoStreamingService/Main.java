package VideoStreamingService;

public class Main {
    public static void main(String[] args) {
        // Test Movie
        Video movie = new Movie("Hello", 123, 7.5);
        System.out.println(movie.getInfo());

        // Test TvSeries
        Video tvSeries = new TvSeries("Hello", 123, 9);
        System.out.println(tvSeries.getInfo());
    }
}
