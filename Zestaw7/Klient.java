import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien ;
    Adres adres;
    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
        this.adres = adres;
    }
    public void Dodajzamowienie(Zamowienie z) {
        this.listaZamowien.add(z);
    }
    @Override void getClass(){
    System.out.println("Czesc jestem klasa Klient");
    }
    public void WyswietlHistorieZamowien() {

        for(int i=0; i<listaZamowien.size(); i++) {

            listaZamowien.get(i).getKoszykZakupowy().WyswietlZawartoscKoszyka();
            System.out.println(listaZamowien.get(i).getStatusZamowienia());
        }

    }
    /*
    public double ObliczLacznyKoszt(){

        double suma;
        for(int i=0; i<listaZamowien.size(); i++) {

             suma += listaZamowien.get(i).koszykZakupowy.obliczCalkowitaWartosc();
        }
        return suma;
        //System.out.println(suma);
    }
    */
}
