import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produkt myObj = new Produkt("kawa",100,39.00);
        Produkt myObj1 = new Produkt("marmolada",10,9.00);
        Produkt myObj2 = new Produkt("pizza mrozona",1000,19.00);
        Produkt myObj3 = new Produkt("zupa z paczki",0,2.00);
        myObj.wyswietlIformacje();
        myObj.DodajDoMagazynu(20);
        myObj.wyswietlIformacje();
        myObj.UsunzMagazynu(10);
        myObj.wyswietlIformacje();
        myObj.UsunzMagazynu(1000);
        myObj.wyswietlIformacje();
        KoszykZakupowy myobj = new KoszykZakupowy(new ArrayList<Produkt>());
        myobj.dodajProdukt(myObj);
        myobj.dodajProdukt(myObj3);
        myobj.dodajProdukt(myObj1);
        myobj.dodajProdukt(myObj2);
        myobj.dodajProdukt(myObj);
        myobj.WyswietlZawartoscKoszyka();
        myobj.obliczCalkowitaWartosc();
        myObj.wyswietlIformacje();
        Zamowienie zamowienie = new Zamowienie(myobj,"Oczekiwanie na Platnosc");
        zamowienie.UstawStatusZamowienia("gotowe do wysylki");
        zamowienie.WyswietlZamowienie();
        Zamowienie zamowienie1 = new Zamowienie(myobj,"Oczekiwanie na Platnosc");
        Klient klient = new Klient("Robert","Maklowicz",new ArrayList<Zamowienie>());
        klient.Dodajzamowienie(zamowienie);
        klient.Dodajzamowienie(zamowienie1);
        klient.WyswietlHistorieZamowien();

        }
    }
