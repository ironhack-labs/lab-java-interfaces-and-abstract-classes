public class VideoStreamingService {

    /**
     * Video Streaming Service
     * Suppose you are building a video streaming service. All videos are either TV series or movies.
     * Create an abstract class named Video and define the following properties and behaviors:
     * title: a String representing the title of the video
     * duration: an int representing the duration of the video in minutes
     * getInfo(): a method that returns a String containing all of the video's properties in a readable format
     * Create two classes that extend Video: TvSeries and Movie.
     * TvSeries objects should have an additional episodes property, an int representing the number of episodes in the
     * series.
     * Movie objects should have an additional rating property, a double representing the rating of the movie.
     */


    abstract class Video{

        public Video(String title, int duration) {
            this.title = title;
            this.duration = duration;
        }

        abstract String getInfo();

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        protected String title;
        protected int duration;


    }

    class TvSeries extends Video{

        public TvSeries(String title, int duration, int episodes ) {
            super(title, duration);
            this.episodes =episodes ;
        }

        public int getEpisodesQuantity() {
            return episodes ;
        }

        public void setEpisodesQuantity(int episodesQuantity) {
            this.episodes  = episodes ;
        }


        @Override
        String getInfo() {
            return String.format("Title: %s\nDuration: %d minutes\nEpisodes: %d", title, duration, episodes);
        }

        private int episodes ;
    }

    class Movie extends Video{

        public Movie(String title, int duration) {
            super(title, duration);
        }

        @Override
        String getInfo() {
            return String.format("Title: %s\nDuration: %d minutes\nRating: %.1f", title, duration, rating);
        }
        private double rating;
    }
}
