abstract class Warzywo extends ProduktSpozywczy{
    abstract void smak();
    abstract void umyj();
    abstract void zjedz();

    public Warzywo(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, iloscNaMagazynie, cena);
    }
}
