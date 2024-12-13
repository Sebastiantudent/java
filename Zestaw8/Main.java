import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produkt myObj = new Produkt("kawa",50,39.00);
        Produkt myObj1 = new Produkt("marmolada",500,9.00);
        Produkt myObj2 = new Produkt("pizza mrozona",70,19.00);
        Produkt myObj3 = new Produkt("zupa z paczki",1000,2.00);
        ArrayList<Produkt> produkt = new ArrayList<>();
        produkt.add(myObj);
        produkt.add(myObj1);
        produkt.add(myObj2);
        produkt.add(myObj3);
        ArrayList<Integer> ilosc = new ArrayList<>();
        ilosc.add(50);
        ilosc.add(500);
        ilosc.add(70);
        ilosc.add(1000);
        Magazyn magazyn = new Magazyn(produkt, ilosc);
        magazyn.Wyswietl();
        Adres adres1 = new Adres("Witosa",46,"Olsztyn","10-432");
        Adres adres2 = new Adres("Witosa",5,34,"Olsztyn","10-612");

        //adres1.ToString();
        //adres2.Pokaz();


    }
}
