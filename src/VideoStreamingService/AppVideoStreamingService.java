package VideoStreamingService;

import java.util.ArrayList;
import java.util.List;

public class AppVideoStreamingService {
    public static void main(String[] args) {
        System.out.println("~~~~~~VIDEO SUMMARY~~~~~~");
        List<Video> videos = new ArrayList<>();

        videos.add(new Movie("Inception", 148, 4.5));
        videos.add(new TvSeries("Breaking Bad", 60, 5));
        videos.add(new Movie("The Matrix", 136, 4.8));
        videos.add(new TvSeries("Game of Thrones", 60, 8));
        videos.add(new Movie("La dama y el vagabundo",100, 5.0));
        videos.add(new TvSeries("The Sopranos", 60, 6));
        for (Video video : videos) {

            System.out.println(video.getInfo());
            System.out.println("<---🎬---⭐------⭐---🎬--->");
        }


    }
}
