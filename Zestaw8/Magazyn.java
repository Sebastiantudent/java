import java.util.ArrayList;

    public class Magazyn {
        private ArrayList<Produkt> lista_Produktow;
        private ArrayList <Integer> ilosc;
        Magazyn(ArrayList<Produkt> lista_Produktow, ArrayList<Integer> ilosc) {
            this.lista_Produktow = lista_Produktow;
            this.ilosc = ilosc;
        }
        void Wyswietl() {
            for (int i = 0; i < this.lista_Produktow.size(); i++) {
                this.lista_Produktow.get(i).wyswietlInformacje();
                System.out.println("ilosc na magazynie: " + this.ilosc.get(i));
            }
        }

        public ArrayList<Integer> getIlosc() {
            return ilosc;
        }

        public ArrayList<Produkt> getLista_Produktow() {
            return lista_Produktow;
        }
    }

