package VideoStreamingService;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setDuration( 160 );
        movie.setTitle(" The Terminator ");
        movie.setRating( 7.5 );
        System.out.println(movie.getInfo()+" rating "+movie.getRating());
    }
}
