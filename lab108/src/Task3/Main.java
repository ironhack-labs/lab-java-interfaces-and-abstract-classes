package Task3;

public class Main {
    public static void main(String[] args) {
        TvSeries tvSeries = new TvSeries("Adolescence", 240, 4);
        Movie movie = new Movie("Dune", 120, 4);

        System.out.println(movie.getInfo());
        System.out.println(tvSeries.getInfo());
    }
}
