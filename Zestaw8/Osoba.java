public class Osoba {
    private String Imie;
    private String Nazwisko;

    Osoba(String imie, String nazwisko) {
        this.Imie = imie;
        this.Nazwisko = nazwisko;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        this.Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.Nazwisko = nazwisko;
    }
}
