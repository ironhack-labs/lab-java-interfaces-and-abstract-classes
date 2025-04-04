package videostreamingservice;

public class VideoStreamingService {
    public static void main(String[] args) {
        Video video1 = new TvSeries("Breaking Bad", 47, 10);
        Video video2 = new Movie("The Shawshank Redemption", 142, 9.5);
        Video video3 = new Movie("The Godfather", 175, 9.0);

        System.out.println(video1.getInfo());
        System.out.println(video2.getInfo());
        System.out.println(video3.getInfo());
    }
}
