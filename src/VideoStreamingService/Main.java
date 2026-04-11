package VideoStreamingService;

public class Main {
    public static void main(String[] args) {

        TvSeries series = new TvSeries("Vikings", 50, 89);
        Movie movie = new Movie("TLOTR: The Return of the King", 201, 8.2);

        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());
    }
}