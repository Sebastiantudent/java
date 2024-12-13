import java.util.ArrayList;
public class KlientIndywidualny extends Klient {
    private final String PESEL;

    public KlientIndywidualny(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adresKlienta, String pesel) {
        super(imie, nazwisko, listaZamowien, adresKlienta);
        this.PESEL = pesel;
    }

    public String getPesel() {
        return PESEL;
    }
}
