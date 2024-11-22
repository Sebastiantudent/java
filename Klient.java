import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien ;
    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
    }
    public void Dodajzamowienie(Zamowienie z) {
        listaZamowien.add(z);
    }
    public void WyswietlHistorieZamowien() {

        for(int i=0; i<listaZamowien.size(); i++) {

            listaZamowien.get(i).koszykZakupowy.WyswietlZawartoscKoszyka();
            System.out.println(listaZamowien.get(i).statusZamowienia);
        }

    }
    public double ObliczLacznyKoszt(){

        double suma;
        for(int i=0; i<listaZamowien.size(); i++) {

             //suma += listaZamowien.get(i).koszykZakupowy.obliczCalkowitaWartosc();
        }
        return suma;
        //System.out.println(suma);
    }

}
