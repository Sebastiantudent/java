public class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String trackName) {
        System.out.println("Video Playing " + trackName);
    }
     @Override public void pause() {
        System.out.println("Video Paused");
     }

    @Override
    public String getCurrentTrack() {
        return "Current track is video";
    }
}
