package VideoStreaming;

public class VideoDemo {
    static void main() {
        Video series = new TVSeries(120 , "Big Brother" , 22);
        Video movie = new Movie(122, "Titanic ", 7.7);

        System.out.println("Series general info is : " + series.getInfo());
        System.out.println("Movies general info is : " + movie.getInfo());
    }
}
