import java.util.ArrayList;
public class KlientFirmowy extends Klient {
   final String NIP;
   final String REGON;
    public KlientFirmowy(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adresKlienta, String NIP, String REGON) {
        super(imie, nazwisko, listaZamowien, adresKlienta);
        this.NIP = NIP;
        this.REGON = REGON;
    }

}
