public class Zamowienie {
    private String statusZamowienia;
    private KoszykZakupowy koszykZakupowy;
    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
    }
    public void UstawStatusZamowienia(String status) {
        this.statusZamowienia = status;
    }
    public void WyswietlZamowienie() {
        koszykZakupowy.WyswietlZawartoscKoszyka();
        System.out.println(statusZamowienia);
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }
    public String getStatusZamowienia() {return statusZamowienia;}
}
