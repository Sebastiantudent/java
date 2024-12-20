import java.util.Objects;

public class Elf {
    private String imie;
    private String stanowisko;
    private int wiek;
    Elf(String imie, String stanowisko, int wiek) {
        this.imie = imie;
        this.stanowisko = stanowisko;
        this.wiek = wiek;
    }
    public void przedstawSie() {
        System.out.println("Cześć, nazywam się "+ imie + ", mam "+ wiek + " lat,"+" a moje stanowisko pracy to " +stanowisko+".");
    }

    public String getImie() {
        return imie;
    }

    public String getStanowisko() {
        return stanowisko;
    }
    public int getWiek() {return wiek;}

    public void setImie(String imie) {
        if(imie == null || imie.equals("")) {
            throw new IllegalArgumentException("imie cannot be null");
        }
        else {
            this.imie = imie;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return wiek == elf.wiek && Objects.equals(imie, elf.imie) && Objects.equals(stanowisko, elf.stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, stanowisko, wiek);
    }

    public void setStanowisko(String stanowisko) {
        if (stanowisko == null || stanowisko.equals("")) {
            throw new IllegalArgumentException("stanowisko cannot be null");
        } else {
            this.stanowisko = stanowisko;
        }
    }

    @Override
    public String toString() {
        return "Elf{" +
                "imie='" + imie + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public void setWiek(int wiek) {
            if(wiek<=0) {
                throw new IllegalArgumentException("wiek nie moze byc ujemny");
            }
            else {
                this.wiek = wiek;
        }
    }

}

