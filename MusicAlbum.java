import java.util.ArrayList;
import java.util.Objects;

public class MusicAlbum {
    private String title;
    private String artist;
    private ArrayList<Double> ratings = new ArrayList<>();
    public MusicAlbum(String title, String artist, ArrayList<Double> ratings) {
        this.title = title;
        this.artist = artist;
        this.ratings = ratings;
    }
    public void addRatings(double rating) {
        ratings.add(rating);

    }
    public void removeRatings(int index) {
        ratings.remove(index);

    }
    public String getTitle() {return title;}
    public String getArtist() {return artist;}
    public ArrayList<Double> getRatings() {return ratings;}
    public void setTitle(String title) {this.title = title;}
    public void setArtist(String artist) {this.artist = artist;}
    public void setRatings(ArrayList<Double> ratings) {this.ratings = ratings;}
    @Override
    public String toString() {
        return "title: " + title + ", artist: " + artist + ", ratings: " + ratings;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, ratings);
    }

}
