package VideoStreamingService;

public class StreamingApplication {
    public  static void main(String[] args) {
        Video tvSerie = new TvSeries("Doctor Who", 1, 30);
        Video movie = new Movie("Lord Of The Rings", 5, 8.5);

        tvSerie.getInfo();
        movie.getInfo();

    }
}
