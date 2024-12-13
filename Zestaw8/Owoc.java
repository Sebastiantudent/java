abstract class Owoc extends ProduktSpozywczy{
    abstract void smak();
    abstract void umyj();
    abstract void zjedz();

    public Owoc(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, iloscNaMagazynie, cena);
    }
}
