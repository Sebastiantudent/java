
import java.util.Objects;

interface ProduktInterface{
    void dodajDoMagazynu(int ilosc);
    void wyswietlInformacje();
    default int ZwiekszDwukrotnieTowar(int ilosc){
        ilosc += ilosc*2;
        return ilosc;
    }
        }
class Produkt implements ProduktInterface {
    private String nazwa;
    private int ilosc;
    private double cena;
    public Produkt(String nazwa,int ilosc, double cena) {
        this.nazwa = nazwa;
        //this.ilosc = ilosc;
        this.cena = cena;
    }
    public void wyswietlInformacje() {
        System.out.println("nazwa produktu: " + this.nazwa);
        //System.out.println("ilosc na magazynie: " + this.ilosc);
        System.out.println("cena: " + this.cena );
    }
    public String toString()
    {
        return "Nazwa: "+this.nazwa+"\nCena: "+this.cena+"\nIlosc na magazynie: "+this.ilosc;
    }
    public void DodajDoMagazynu(int n) {
        this.ilosc += n;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(cena, produkt.cena) == 0 && Objects.equals(nazwa, produkt.nazwa);
    }


    public void dodajDoMagazynu(int ilosc) {
        this.ilosc += ilosc;
    }

    public void UsunzMagazynu(int n) {

        if (this.ilosc >= n) {
            this.ilosc -= n;
        }
    }
    public void setNazwa(String nazwa) {
        if(nazwa!=null)
            this.nazwa = nazwa;
        else
            throw new IllegalArgumentException("nazwa cannot be null");
    }
    public String getNazwa() {return nazwa;}
    public int getIlosc() {return ilosc;}
    public double getCena() {return cena;}
    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }
}

