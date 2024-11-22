public class Produkt {
    String nazwa;
    int ilosc;
    double cena;
    public Produkt(String nazwa, int ilosc, double cena) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cena = cena;
    }
    public void wyswietlIformacje() {
        System.out.println("nazwa produktu: " + this.nazwa);
        System.out.println("ilosc na magazynie: " + this.ilosc);
        System.out.println("cena: " + this.cena );
    }
    public void DodajDoMagazynu(int n) {
        this.ilosc += n;
    }
    public void UsunzMagazynu(int n) {

        if (ilosc >= n) {
            this.ilosc -= n;
        }
    }


}
