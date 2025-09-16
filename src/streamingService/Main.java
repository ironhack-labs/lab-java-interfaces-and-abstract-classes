package streamingService;

public class Main {
    public static void main(String[] args) {

        TvSeries videoSeries = new TvSeries("Penny Dreadful", 5, 87);
        Movie videoMovie = new Movie("Parthenope", 110, 4.5);

        Video[] videos = {videoSeries, videoMovie};

        for (Video video : videos) {
            System.out.println(video.getInfo());
        }

    }
}
