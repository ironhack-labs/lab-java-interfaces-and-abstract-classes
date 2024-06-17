public class MainVideoClass {
    public static void main(String[] args) {
        TvSeries series = new TvSeries("Breaking Bad", 50, 62);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());
    }
}
