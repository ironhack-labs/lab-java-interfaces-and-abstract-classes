package Task3;

public class VideoStreamingService {



    public static void main(String[] args) {

        Video movie=new Movie("Troya",120,4.7);
        Video movie1= new Movie("Enigma", 95, 4.5);
        Video tvSerie=new TvSeries("Fauda", 52,10);
        Video tvSerie1=new TvSeries("Friends",45, 10 );

        System.out.println("Display all movies and Tv series: ");
        System.out.println(movie.getInfo());
        System.out.println(movie1.getInfo());
        System.out.println(tvSerie.getInfo());
        System.out.println(tvSerie1.getInfo());
    }
}
