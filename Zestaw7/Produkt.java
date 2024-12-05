import java.util.Objects;

public class Produkt {
    private String nazwa;
    private int ilosc;
    private double cena;
    public Produkt(String nazwa,int ilosc, double cena) {
        this.nazwa = nazwa;
        //this.ilosc = ilosc;
        this.cena = cena;
    }
    public void wyswietlIformacje() {
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


    public void UsunzMagazynu(int n) {

        if (this.ilosc >= n) {
            this.ilosc -= n;
        }
    }
    public String getNazwa() {return nazwa;}
    public int getIlosc() {return ilosc;}
    public double getCena() {return cena;}
    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }
}

