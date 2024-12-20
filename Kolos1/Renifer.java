import java.util.Objects;

public class Renifer {
    private String imie;
    private int predkosc;
    Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }
    void nakarmRenifera(){
        this.predkosc = this.predkosc + 5;
    }

    public int getPredkosc() {
        return predkosc;
    }
    public String getImie() {return imie;}

    public void setImie(String imie) {
        if(imie == null || imie.equals("")) {
            throw new IllegalArgumentException("imie cannot be null");
        }
        else {
            this.imie = imie;
        }
    }

    @Override
    public String toString() {
        return "Renifer{" +
                "imie='" + imie + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renifer renifer = (Renifer) o;
        return predkosc == renifer.predkosc && Objects.equals(imie, renifer.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, predkosc);
    }

    public void setPredkosc(int predkosc) {
        if(predkosc<=0) {
            throw new IllegalArgumentException("predkosc nie moze byc ujemny");
        }
        else {
            this.predkosc = predkosc;
    }
        }
}
