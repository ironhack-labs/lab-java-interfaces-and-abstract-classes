package videostreamingservice;

public class Main {

    public static void main(String[] args) {

        Movies movie1 = new Movies("The Matrix", 120, 5);
        TvSeries tvSeries1 = new TvSeries("Game of Thrones", 60, 8);

        System.out.println(movie1.toString());
        System.out.println(tvSeries1.toString());
    }
}
