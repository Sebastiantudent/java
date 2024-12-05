
import java.util.ArrayList;
import java.time.LocalDate;
    public class Sklep {
        ArrayList<Produkt> produkty;
        Magazyn MagazynSklepu;
        String NazwaSklepu;
        LocalDate DataPowstania;
        public Sklep(ArrayList<Produkt> produkty,Magazyn MagazynSklepu, String NazwaSklepu, LocalDate DataPowstania) {
            this.produkty = produkty;
            this.MagazynSklepu = MagazynSklepu;
            this.NazwaSklepu = NazwaSklepu;
            if (DataPowstania.isBefore(LocalDate.now())) {
                this.DataPowstania = DataPowstania;
            }
            else throw new IllegalArgumentException("The given date cannot be in the future");
        }

        public void dodajProdukt(Produkt produkt) {
            produkty.add(produkt);
        }
        public void wyswietlOferty() {
            for(int i = 0; i < produkty.size(); i++) {
                System.out.println(produkty.get(i).getNazwa());
            }
        }
        public Produkt wyszukajProduktu(String nazwa) {
            for(int i = 0; i < produkty.size(); i++) {
                if(produkty.get(i).getNazwa().equals(nazwa)) {
                    return produkty.get(i);
                }
            }
            return null;
        }
        public void zakupy(Produkt produkt, int ilosc, KoszykZakupowy koszyk) {
            for(int i = 0; i < ilosc; i++) {
                koszyk.dodajProdukt(produkt);
            }
        }
    }

