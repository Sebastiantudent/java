import java.util.ArrayList;
import java.util.Objects;

public class RockAlbum extends MusicAlbum {
    private String rockgenre;
    public RockAlbum(String title, String artist, ArrayList<Double> ratings, String rockgenre) {
     super(title, artist, ratings);
     this.rockgenre = rockgenre;
    }
    public String getRockgenre() {return rockgenre;}
    public void setRockgenre(String rockgenre) {this.rockgenre = rockgenre;}

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getTitle() + " - " + getArtist() + " - " + getRatings() + " - " + rockgenre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rockgenre);
    }
}
