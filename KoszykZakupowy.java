import java.util.ArrayList;

public class KoszykZakupowy {
    ArrayList<Produkt> lista_Produktow;
    public KoszykZakupowy(ArrayList<Produkt> lista_Produktow) {
        this.lista_Produktow = lista_Produktow;

    }
    public void dodajProdukt(Produkt n) {
        if(n.ilosc>=1) {
            lista_Produktow.add(n);
            n.ilosc-=1;
        }
    }
    public void WyswietlZawartoscKoszyka() {
        int ilosc = 0;
        for(int i=0; i<lista_Produktow.size(); i++) {
            for(int j=0; j<lista_Produktow.size(); j++) {
                if(lista_Produktow.get(i) == lista_Produktow.get(j)) {
                    ilosc++;
                }
            }
            System.out.println(ilosc+ " razy " + lista_Produktow.get(i).nazwa);
            ilosc=0;
        }
    }
    public double obliczCalkowitaWartosc() {
        double cal_cena=0;
        for(int i=0; i<lista_Produktow.size(); i++) {
           cal_cena += lista_Produktow.get(i).cena;
        }
        return cal_cena;
    }
}
