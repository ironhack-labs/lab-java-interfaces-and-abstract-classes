package VideoStreaming;

public class Movies extends Video{
    double raiting;

    Movies(String title, int duration, double raiting){
        super(title, duration);
        this.raiting = raiting;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Raiting: " +raiting;
    }
}
