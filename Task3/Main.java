package Task3;

public class Main {
    public static void main( String [] args){

        TvSeries tvSeries = new TvSeries("Stranger Things",45,10);
        Movies movies = new Movies("Batman",90,4.5);
        System.out.println(movies.getInfo());
        System.out.println(tvSeries.getInfo());

    }
}
