package video;

public class Main {
    public static void main(String[] args) {

        TvSeries friends = new TvSeries("friends", 90, 3);
        Movie startWars = new Movie("star wars", 180, 4.9);
        Movie day1 = new Movie("Day 1", 180, 4.5);

        System.out.println(friends.getEpisodes());
        System.out.println(friends);

        System.out.println(startWars.getRating());


    }
}
