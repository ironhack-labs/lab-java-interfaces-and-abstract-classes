
public class Main {
    public static void main(String[] args) {

        TvSeries tvseries = new TvSeries("Lord of the Rings", 180,2);

        System.out.println(tvseries.getInfo());

        Movies movie = new Movies("Moana",96,9.15);


        System.out.println(movie.getInfo());
    }

}

