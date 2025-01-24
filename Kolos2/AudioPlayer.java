import java.io.File;

public class AudioPlayer implements MediaPlayer {
    public void play(String fileName) {
        System.out.println("Audio Playing " + fileName);
    }
    public void pause() {
        System.out.println("Audio Paused");
    }
    public String getCurrentTrack() {
        return "Current Track is audio";
    }
}
