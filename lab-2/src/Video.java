

import javax.swing.*;
import java.security.Provider;


public class Video {
    public String title;
    public int duration;

    public Video(String title, int duration, Provider provider) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;


    }
}

